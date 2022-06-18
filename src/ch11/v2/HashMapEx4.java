package ch11.v2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        HashMap map = new HashMap();

        for(int i=0; i<data.length; i++){
            if(map.containsKey(data[i])){
                Integer value = (Integer)map.get(data[i]);
                map.put(data[i],new Integer(value.intValue()+1));
//                map.put(data[i], value + 1);
                // default 값 지정해서 가져오기
//                map.put(data[i], map.getOrDefault(data[i],1));
            }else{
                map.put(data[i], new Integer(1));
                //map.put(data[i], 1);
            }
        }

        //entrySet() 으로 set 을 얻어 iterator 사용
        Iterator it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            int value = ((Integer)e.getValue()).intValue();
            System.out.println(e.getKey() + ":" + printBar('#',value) + " " + value);
        }
    }

    static String printBar(char ch, int value){
        char[] bar = new char[value];

        for(int i=0; i<value; i++){
            bar[i] = ch;
        }

        return new String(bar);

    }

}
