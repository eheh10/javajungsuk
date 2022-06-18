package ch11.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("1");
        list.add("2");


        ListIterator it = list.listIterator();

        while(it.hasNext()){ //순방향
            System.out.println(it.next());
        }

        System.out.println();

        while(it.hasPrevious()){ //역방향
            System.out.println(it.previous());
        }
    }
}
