package ch11.v2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack(); //stack 은 클래스로 구현하여 제공
        Queue q = new LinkedList(); //queue 는 인터페이스로 정의

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack = ");
        while(!st.empty()){
            System.out.println(st.pop());
        }

        System.out.println("= Queue = ");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
