package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor,eng,math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)((getTotal()/3f)*10+0.5)/10f;
    }

    public String toString(){
        return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
    }

    //기본 정렬 기준
    public int compareTo(Object o){
        if(o instanceof  Student){
            Student tmp = (Student)o;

            //String.compareTo()
            return name.compareTo(tmp.name);
        }else{
            return -1;
        }
    }
}

public class Exercise11_5 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("김길동",1,2,50,100,90));
        list.add(new Student("이길동",1,3,60,70,80));
        list.add(new Student("나길동",1,4,70,80,90));
        list.add(new Student("박길동",1,5,80,50,100));

        Collections.sort(list);
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
