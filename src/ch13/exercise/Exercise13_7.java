package ch13.exercise;

class Exercise13_7 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try{
            //일시정지 상태
            Thread.sleep(6*1000);
        } catch (Exception e) {
        }

        stopped = true;
        //일시정지 -> 실행대기상태
        th1.interrupt();
        System.out.println("stopped");
    }
}

class Thread5 extends Thread{
    public void run(){
        for(int i=0;!Exercise13_7.stopped;i++){
            System.out.println(i);

            try{
                //일시정지 상태
                Thread.sleep(2*1000);
            }catch(Exception e){

            }
        }
    }
}