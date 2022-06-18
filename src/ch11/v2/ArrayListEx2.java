package ch11.v2;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";

        //크기 여유 있게 -> 더 많은 객체 저장 시 배열 복사 일어나기 때문
        ArrayList<String> list = new ArrayList<>((source.length()/LIMIT)+10);

        for(int i=0; i < source.length(); i = i+LIMIT){
            if (i+LIMIT > source.length()) {
                list.add(source.substring(i));

                break;
            }
            list.add(source.substring(i, i + LIMIT));
        }

        for(String str:list){
            System.out.println(str);
        }


    }
}
