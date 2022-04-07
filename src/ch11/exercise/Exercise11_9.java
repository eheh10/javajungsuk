package ch11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student3 extends Student2 implements Comparable{
    int classRank;

    Student3(String name, int ban, int no, int kor, int eng, int math) {
        super(name, ban, no, kor, eng, math);
    }

    public String toString(){
        return super.toString()
                +","+classRank;
    }
}

class ClassTotalComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student3 && o2 instanceof Student3){
            Student3 s1 = (Student3)o1;
            Student3 s2 = (Student3)o2;

            if(s1.ban!=s2.ban){
                //반 오름차순
                return s1.ban-s2.ban;
            }
            //총점 내림차순
            return s2.total - s1.total;
        }

        return -1;
    }
}

public class Exercise11_9 {
    private static void calculateClassRank(ArrayList list) {
        //총점 기준 내림차순 정렬
        Collections.sort(list, new ClassTotalComparator());

        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;

        for(int i=0,n=0; i<list.size();i++,n++){
            Student3 s = (Student3)list.get(i);

            //반이 바뀌면 초기화
            if (s.ban!=prevBan){
                n=0;
                prevBan = s.ban;
                prevRank = -1;
                prevTotal = -1;
            }

            //총점이 같으면 이전 등수가 등수
            if(s.total==prevTotal){
                s.classRank = prevRank;
            }else{
                //총점이 다르면 등수 계산
                s.classRank = n+1;
            }

            //현재 총점과 등수를 이전총점,이전등수로 저장
            prevRank = s.classRank;
            prevTotal = s.total;
        }
    }

    private static void calculateSchoolRank(ArrayList list) {
        //총점 기준 내림차순 정렬
        Collections.sort(list);

        int prevRank = -1;
        int prevTotal = -1;

        for(int i=0; i<list.size();i++){
            Student3 s = (Student3)list.get(i);

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
        list.add(new Student3("홍길동",1,1,100,100,100));
        list.add(new Student3("김길동",1,2,50,100,90));
        list.add(new Student3("이길동",2,3,60,70,80));
        list.add(new Student3("나길동",3,4,70,80,90));
        list.add(new Student3("박길동",4,5,80,50,100));

        calculateSchoolRank(list);
        calculateClassRank(list);

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
