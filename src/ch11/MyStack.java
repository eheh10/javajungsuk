package ch11;

import java.util.EmptyStackException;
import java.util.Vector;

class MyStack extends Vector {
    public Object push(Object item) {
		addElement(item);
		return item;
    }

    public Object pop() {
		Object obj = peek(); //마지막 읽어서
		removeElementAt(size() - 1); //삭제

		return obj;
    }

    public Object peek() {
		int	len = size();

		if (len == 0) {
			throw new EmptyStackException();
		}
		return elementAt(len - 1); //스택은 1부터 시작
    }

    public boolean empty() {
		return size() == 0;
    }
    
    public int search(Object o) {
		int i = lastIndexOf(o); //끝에서 부터 찾는다
		if (i >= 0) {
			return size() - i; //맨 위 객체의 index 가 1
		}

		return - 1;
	}
}
