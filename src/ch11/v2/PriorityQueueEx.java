package ch11.v2;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue(); //저장순서와 관계 없이 우선 순위가 높은 것부터 poll
        pq.offer(3); //오토박싱
        pq.offer(new Integer(1));
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq); //힙에 의해서 저장순서와 다름

        Object obj = null;
        while((obj=pq.poll())!=null){ //poll 은 queue 가 비면 예외가 아닌 null 반환
            System.out.println(obj); //Integer class 에 Comparable 이 구현되어 있음 -> 객체의 크기를 비교할 수 있는 방법 제공해야함
        }
    }
}
