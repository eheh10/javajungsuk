package ch11.v2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet();
//        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        // HashSet 은 저장된 순서를 자체적인 저장방식에 따라 순서를 결정시킴 -> LinkedHashSet 이 더 적합
        for( ; set.size()<25; ){
            set.add((int)(Math.random()*50)+1+"");
        }

        Iterator it = set.iterator();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = Integer.parseInt((String)it.next()); //next() 반환 타입은 Object
                System.out.print((board[i][j] < 10 ? "  ": " ")+board[i][j]);
            }
            System.out.println();
        }
    }
}
