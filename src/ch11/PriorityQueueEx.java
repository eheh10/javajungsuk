package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueEx {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3); //오토박싱
		pq.offer(1); //우선순위는 숫자가 작을수록 높다
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);

		System.out.println(pq);

		Object obj = null;

		while((obj = pq.poll())!=null) {
			System.out.println(obj);
		}
	}
}
