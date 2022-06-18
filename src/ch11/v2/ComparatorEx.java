package ch11.v2;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};

		// 정렬할 때 정렬할 대상, 정렬 기준이 필요
		// 대상 객체에 Comparable 이 구현되어 있다면 정렬할 대상만 인자로 넘길 수 있음
		Arrays.sort(strArr);
		System.out.println("strArr=" + Arrays.toString(strArr)); //대문자가 더 앞에 위치

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //정렬 기준 지정 가능 //대소문자 구분x
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator { //내림차순 정렬
	public int compare(Object o1, Object o2){
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1 ; //기본정렬의 역
			//return c2.compareTo(c1);
		}
		return -1;
	} 
} 
