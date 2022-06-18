package ch11.v2;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
    public static void main(String[] args) {
        if(args.length!=-1){
            System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example: java ExpValidCheck \"((2+3)*1)+3\"");
            System.exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expression:"+expression);

        try{
            for(int i=0; i<expression.length(); i++){
                char ch = expression.charAt(i);

                if(ch=='('){
                    st.push(ch+""); // ( 는 push
                    continue;
                }
                st.pop(); // ) 는 pop -> EmptyStackException 발생 가능
            }

            if(st.isEmpty()){
                System.out.println("괄호 일치");
            }else{
                System.out.println("괄호 불일치");
            }
        }catch (EmptyStackException e){
            System.out.println("괄호가 일치하지 않습니다");
        }
    }
}
