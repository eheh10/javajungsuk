package ch11;

import java.util.TreeSet;

class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80,95,50,35,45,65,10,100};

		for(int i=0; i<score.length; i++){
			set.add(score[i]);
		}

		// 50이 저장된 노드의 왼쪽 노드가 루트인 서브 트리
		System.out.println("50보다 작은 값 :"+ set.headSet(50));
		// 50이 포함
		System.out.println("50보다 큰 값 :"+ set.tailSet(50));
	}
}
