package ch11.v2;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // 빈공간 없애기 -> 용량==크기 (배열 복사 발생)
        System.out.println("After trimToSize()");
        print(v);

        v.ensureCapacity(6); // 최소 용량 지정 (현재 용량이 6보다 작은 경우 배열 복사 발생)
        System.out.println("After ensureCapacity(6)");
        print(v);

        v.setSize(7); // 크기 지정 (현재 용량이 7보다 작은 경우 용량 2배로 증가 -> 배열 복사 발생)
        System.out.println("After setSize(7)");
        print(v);

        v.clear(); // 모든 요소 삭제
        System.out.println("After clear()");
        print(v);

    }

    public static void print(Vector v){
        System.out.println(v);
        System.out.println("size:"+v.size());
        System.out.println("capacity:"+v.capacity());
    }
}
