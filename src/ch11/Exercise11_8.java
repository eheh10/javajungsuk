package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student2 extends Student implements Comparable{
    int total;
    int schoolRank;

    Student2(String name, int ban, int no, int kor, int eng, int math) {
        super(name, ban, no, kor, eng, math);
        total = kor+eng+math;
    }

    public int compareTo(Object o){
        if(o instanceof Student2){
            Student2 s = (Student2)o;
            return s.total - this.total;
        }
        return -1;
    }

    public String toString(){
        return super.toString()
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank;
    }

}

public class Exercise11_8 {
    private static void calculateSchoolRank(ArrayList list) {
        //총점 기준 내림차순 정렬
        Collections.sort(list);

        int prevRank = -1;
        int prevTotal = -1;

        for(int i=0; i<list.size();i++){
            Student2 s = (Student2)list.get(i);

            //총점이 같으면 이전 등수가 등수
            if (s.total==prevTotal){
                s.schoolRank = prevRank;
            }else{
                //총점이 다르면 등수 계산
                s.schoolRank = i+1;
            }

            //현재 총점과 등수를 이전총점,이전등수로 저장
            prevRank = s.schoolRank;
            prevTotal = s.total;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student2("홍길동",1,1,100,100,100));
        list.add(new Student2("김길동",1,2,50,100,90));
        list.add(new Student2("이길동",2,3,60,70,80));
        list.add(new Student2("나길동",3,4,70,80,90));
        list.add(new Student2("박길동",4,5,80,50,100));

        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
