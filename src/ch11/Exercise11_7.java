package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class BanNoAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student && o2 instanceof Student){
            Student s1 = (Student)o1;
            Student s2 = (Student)o2;

            /*
            if(s1.ban == s2.ban){
                return s1.no < s2.no?1:0;
            }else{
                return s1.ban < s2.ban?1:0;
            }
             */
            return s1.ban==s2.ban ? s1.no-s2.no : s1.ban-s2.ban;
        }
        return -1;
    }
}

public class Exercise11_7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("김길동",1,2,50,100,90));
        list.add(new Student("이길동",2,3,60,70,80));
        list.add(new Student("나길동",3,4,70,80,90));
        list.add(new Student("박길동",4,5,80,50,100));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
