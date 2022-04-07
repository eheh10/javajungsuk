package ch11;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};

		Arrays.sort(strArr); //String 클래스의 Comparable - 공백,숫자,대문자,소문자 오름차순 (유니코드 오름차순)
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //상수 형태로 기준 제공
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); //역순
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator { //새로운 정렬 기준 정의
	public int compare(Object o1, Object o2){
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1; //compareTo() 호출 위해 형변환
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1 ;
			//return c2.compareTo(c1);
		}
		return -1;
	} 
} 
