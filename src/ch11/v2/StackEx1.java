package ch11.v2;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.네이트"); //back 에 push
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack(); //back pop && forward push
        System.out.println("뒤로 버튼을 누른 후");
        printStatus();

        goBack();
        System.out.println("뒤로 버튼을 누른 후");
        printStatus();

        goForward(); // forward pop && back push
        System.out.println("앞으로 버튼을 누른 후");
        printStatus();

        goURL("naver.com");
        System.out.println("새로운 주소로 이동 후");
        printStatus();

    }

    public static void printStatus() {
        System.out.println("back "+back);
        System.out.println("forward "+forward);
        System.out.println("현재화면 "+back.peek()); //back 의 마지막 요소가 현재화면
        System.out.println();
    }

    public static void goURL(String url){
        back.push(url);
        if(!forward.empty()){
            forward.clear();
        }
    }

    public static void goForward(){
        if(!forward.empty()){
            back.push(forward.pop());
        }
    }

    public static void goBack(){
        if(!back.empty()){
            forward.push(back.pop());
        }
    }
}
