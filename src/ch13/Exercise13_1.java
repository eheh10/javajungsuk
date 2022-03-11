package ch13;

class Exercise13_1 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();

        //Thread th2 = new Thread(new Thread1_2());
        Runnable r = new Thread1_2();
        Thread th2 = new Thread(r);

        th2.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        for (int i=0;i<300;i++){
            System.out.print('-');
        }
    }
}

class Thread1_2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<300;i++){
            System.out.print('|');
        }
    }
}
