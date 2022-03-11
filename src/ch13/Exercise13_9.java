package ch13;

import javax.swing.*;

class Exercise13_9 {
    public static void main(String[] args) {
        Exercise13_9_1 th1 = new Exercise13_9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("입력:");
        System.out.println("입력값은 "+input+" 입니다.");
        th1.interrupt();
    }
}

class Exercise13_9_1 extends Thread{
    public void run(){
        int i=10;

        while(i!=0 && !isInterrupted()){
            System.out.println(i--);

            try{
                //InterruptedException 발생 -> interrupted = false
                Thread.sleep(1000);
            }catch(Exception e){
                //interrupted = true
                interrupt();
            }
        }
        System.out.println("카운트 종료");
    }
}