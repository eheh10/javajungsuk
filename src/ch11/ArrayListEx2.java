package ch11;

import java.util.ArrayList;
import java.util.List;

class ArrayListEx2 {
	public static void main(String[] args) {
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";

//		ArrayList list = new ArrayList();
//		int i=0;
//		for(i=0;i+10<source.length();i+=10){
//			list.add(source.substring(i,i+10));
//		}
//		list.add(source.substring(i)); // ZZZ 가 add
//
//		System.out.println(list);

		final int LIMIT = 10; // 상수로 자를 수를 선언해두면 자를 수를 쉽게 변경할 수 있다
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10); // 실제 저장할 수보다 여유 있는 크기가 적절
		for(int i=0;i < length; i+=LIMIT){
			if (i+LIMIT < length){
				list.add(source.substring(i,i+LIMIT));
			}else{
				list.add(source.substring(i)); // i ~ source.size()-1
			}
		}
	}
} 
