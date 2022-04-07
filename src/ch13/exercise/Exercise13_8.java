package ch13.exercise;

import java.util.Scanner;
import java.util.Vector;

class Exercise13_8 {
    Vector words = new Vector();
    String[] data = {"A","B","C","D","E","F","G"};

    int interval = 2*1000;

    WordGenerator wg = new WordGenerator();

    public static void main(String[] args) {
        Exercise13_8 game = new Exercise13_8();

        game.wg.start();

        Vector words = game.words;

        while(true){
            System.out.println(words);

            String prompt = ">>";
            System.out.println(prompt);

            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();

            int index = words.indexOf(input);

            if(index!=-1){
                words.remove(index);
            }
        }
    }

    class WordGenerator extends Thread{
        public void run(){
            int idx = 0;
            while(true){
                words.add(data[idx++]);

                if(idx==data.length){
                    idx=0;
                }

                try{
                    Thread.sleep(interval);
                }catch (Exception e){
                }
            }
        }
    }
}

