package ch11;

import java.util.ArrayList;
import java.util.Collections;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); //초기용량(배열의 길이) 지정
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		// 오토박싱
//		list1.add(5);
//		list1.add(4);
//		list1.add(2);
//		list1.add(0);
//		list1.add(1);
//		list1.add(3);

		ArrayList list2 = new ArrayList(list1.subList(1,4)); //to ~ from-1 까지
		print(list1, list2);

		Collections.sort(list1); //default: 오름차순
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); //포함 여부

		System.out.println("\nAdd values in list2");
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //인덱스 지정 추가
		print(list1, list2);

		System.out.println("Update index 3 value of list2. A -> AA");
		list2.set(3, "AA");
		print(list1, list2);

//		System.out.println("list1.removeAll(list2):"+list1.removeAll(list2)); //공통된 것들 삭제
//		print(list1, list2);

		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2)); //공통된 것만 "남기고" 나머지 삭제
		print(list1, list2);

		System.out.println("Remove duplication values in list2");
		for(int i=list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}

//		for(int i=0; i < list2.size()-1; i++) { //삭제하면서 list1 에서 자리 이동 -> i는 계속 증가 -> 삭제가 안되는 경우 발생
//			if(list1.contains(list2.get(i)))
//				list2.remove(i);
//		}
		print(list1, list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
