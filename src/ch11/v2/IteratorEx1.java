package ch11.v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("1");
        list.add("2");


        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        it = list.iterator(); //이터레이터를 다 사용하면 다시 얻어야함 -> 단방향이기 때문
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
