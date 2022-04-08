package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);
        System.out.println();

        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);
        System.out.println();

        Collections.rotate(list,2); //반시계 방향 회전(오른쪽 2칸 이동)
        System.out.println(list);
        System.out.println();

        Collections.swap(list,0,2); // index 0 과 index 2 를 교환
        System.out.println(list);
        System.out.println();

        Collections.shuffle(list); //위치 임의 변경
        System.out.println(list);
        System.out.println();

        Collections.sort(list, Collections.reverseOrder()); // 역순 정렬 == reverse(list)
        System.out.println(list);
        System.out.println();

        Collections.sort(list); //기본 정렬
        System.out.println(list);
        System.out.println();

        int idx = Collections.binarySearch(list,3); //3이 저장된 index 반환
        System.out.println("index of 3:"+idx);
        System.out.println();

        System.out.println("max="+Collections.max(list));
        System.out.println("min="+Collections.min(list));
        System.out.println("min="+Collections.max(list,Collections.reverseOrder()));
        System.out.println();

        Collections.fill(list,9); //9로 채우기
        System.out.println(list);
        System.out.println();

        List newList = Collections.nCopies(list.size(),2); //list 와 같은 크기 리스트를 만들어 2로 채우기
        System.out.println("newList="+newList);
        System.out.println("list="+list);
        System.out.println();

        System.out.println(Collections.disjoint(list,newList)); //공통 요소가 없는 경우 true
        System.out.println();

        Collections.copy(list, newList); //newList 값을 list에 복사
        System.out.println("newList="+newList);
        System.out.println("list="+list);
        System.out.println();

        Collections.replaceAll(list, 2, 1); //2 를 모두 1로 변경
        System.out.println("list="+list);
        System.out.println();

        Enumeration e = Collections.enumeration(list);
        ArrayList list2 = Collections.list(e); //list의 값들을 enumeration 으로 읽어 list로 만들기
        System.out.println("list2="+list2);
        System.out.println();
    }
}
