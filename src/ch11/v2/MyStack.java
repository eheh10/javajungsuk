package ch11.v2;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack  extends Vector {
    public Object push(Object item){
        addElement(item);
        return item;
    }

    public Object pop(){
        Object obj = peek(); //마지막 요소 읽기
        removeElementAt(size()-1); //마지막 요소 삭제
        return obj;
    }

    public Object peek() {
        int len = size();

        if(len==0){
            throw new EmptyStackException(); //stack 이 비어있는 경우 예외 발생
        }

        return elementAt(len-1);
    }

    public boolean empty(){
        return size() == 0;
    }

    public int search(Object o){
        int i = lastIndexOf(o); //뒤에서 부터 찾기 (String클래스의 lastIndexOf 와 다름)

        if(i >= 0){ //객체를 찾은 경우
            return size() - i;
        }

        return -1;
    }
}
