package ch11.v2;

import java.util.Arrays;

class ArraysEx {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};

		System.out.println("arr="+ Arrays.toString(arr));
		System.out.println("arr2D="+ Arrays.deepToString(arr2D));
		System.out.println("arr2D="+ Arrays.toString(arr2D)); //다차원 배열인 경우 toString 사용시 주소값 출력

		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7); //남은 자리는 0으로 채워짐
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //index 는 from~to-1
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //남은 자리는 0으로 채워짐

		System.out.println("arr2="+ Arrays.toString(arr2));
		System.out.println("arr3="+ Arrays.toString(arr3));
		System.out.println("arr4="+ Arrays.toString(arr4));
		System.out.println("arr5="+ Arrays.toString(arr5));
		System.out.println("arr6="+ Arrays.toString(arr6));

		int[] arr7 =  new int[5];
		Arrays.fill(arr7, 9);  // 9로 채우기
		System.out.println("arr7="+ Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); //채울 값을 함수형 인터페이스나 람다식으로 지정
		System.out.println("arr7="+ Arrays.toString(arr7));

		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(Arrays.equals(str2D, str2D2)); // 배열에 저장된 배열의 주소 값을 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //다차원 배열은 deepEquals 로 비교해야함

		char[] chArr = { 'A', 'D', 'C',  'B', 'E' };

		int idx = Arrays.binarySearch(chArr, 'B'); //이진 탐색 -> 정렬이 되어 있는 상태여야 한다
		System.out.println("chArr="+ Arrays.toString(chArr));
		System.out.println("index of B ="+ Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		Arrays.sort(chArr); //정렬
		System.out.println("chArr="+ Arrays.toString(chArr));
		System.out.println("index of B ="+ Arrays.binarySearch(chArr, 'B'));
	}
}
