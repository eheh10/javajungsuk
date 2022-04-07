package ch16.exercise;

import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


class ChatServer extends Frame {
    String nickname="";

    DataOutputStream out;
    DataInputStream in;

    Panel p = new Panel();
    TextArea ta = new TextArea();
    TextField tf = new TextField();

    ChatServer(String nickname){
        super("Chatting");
        this.nickname = nickname;

        p.setLayout(new BorderLayout());
        p.add(tf,"Center");

        add(ta,"Center");
        add(p,"South");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        EventHandler handler = new EventHandler();
        ta.addFocusListener(handler);
        tf.addFocusListener(handler);
        tf.addActionListener(handler);

        ta.setEditable(false);
        setBounds(200,200,300,200);
        setVisible(true);
        tf.requestFocus();
    }

    void startServer(){
        ServerSocket serverSocket = null;
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(7777);
            ta.setText("서버 준비 완료");

            socket = serverSocket.accept();
            ta.append("\r\n"+"상대방과 연결되었습니다");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            while(in!=null){
                try{
                    String msg = in.readUTF();
                    ta.append("\r\n"+msg);
                }catch(IOException e){
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("USAGE: java ChatServer NICKNAME");
            System.exit(0);
        }

        ChatServer chatWin = new ChatServer(args[0]);
        chatWin.startServer();
    }

    class EventHandler extends FocusAdapter implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            String msg = tf.getText();

            if("".equals(msg)){
                return;
            }

            if(out!=null){
                try{
                    out.writeUTF(nickname+"> "+msg);
                }catch(IOException e){

                }
            }
            ta.append("\r\n"+nickname+"> "+msg);
            tf.setText("");
        }

        public void focusGained(FocusEvent e){
            tf.requestFocus();
        }
    }
}
