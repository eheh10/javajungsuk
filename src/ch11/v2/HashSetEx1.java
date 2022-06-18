package ch11.v2;

import java.util.HashSet;
import java.util.Set;

class HashSetEx1 {
	public static void main(String[] args) {
		// String.valueOf(1) != Integer.valueOf(1)
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();

		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}

		//set은 get메서드가 없기때문에 하나씩 요소에 접근하려면 iterator 사용
		System.out.println(set);
	}
}
