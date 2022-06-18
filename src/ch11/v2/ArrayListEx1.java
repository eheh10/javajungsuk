package ch11.v2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); //크기 지정
        list1.add(5); //오토박싱
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4)); //fromIndex ~ toIndex-1
        print(list1,list2);

        // 정렬 (기본-오름차순)
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1.containsAll(list2):"+ list1.contains(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1,list2);

        list2.set(3,"AA"); //값 변경
        print(list1,list2);

        // 차집합
//        System.out.println("list1.retainAll(list2):"+list1.removeAll(list2));
//        print(list1,list2);

        // 교집합
        System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
        print(list1,list2);

        //뒤에서부터 삭제 - 자리이동을 피하기 위함
        for(int i=list2.size()-1; i>=0; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1,list2);

        //앞에서부터 삭제하는 경우 - 앞의 요소 삭제 -> 자리 이동 발생 -> i도 감소 필요(그렇지 않으면 삭제가 안되는 요소가 존재)
//        for(int i=0; i<list2.size(); i++){
//            if(list1.contains(list2.get(i))){
//                list2.remove(i);
////                i--;
//            }
//        }
//        print(list1,list2);
    }

    static void print(ArrayList list1,ArrayList list2){
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
