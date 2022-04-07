package ch16.exercise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

class SourceViewer extends Frame{
    TextField tf = new TextField();
    TextArea ta = new TextArea();

    SourceViewer(String title){
        super(title);

        add(tf,"North");
        add(ta,"Center");

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySource();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setBounds(500,200,500,300);
        setVisible(true);
    }

    void displaySource(){
        URL url = null;
        BufferedReader input = null;
        String address = tf.getText().trim();
        String line = "";

        ta.setText("");

        try{
            if(!address.startsWith("http://")){
                address = "http://"+address;
            }
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));

            while((line=input.readLine())!=null){
                ta.append(line+"\n");
            }

            input.close();
        }catch (Exception e){
            ta.setText("유효하지 않은 URL");
        }
    }

    public static void main(String[] args) {
        SourceViewer mainWin = new SourceViewer("Source Viewer");
    }
}
