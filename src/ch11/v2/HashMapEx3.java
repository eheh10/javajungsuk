package ch11.v2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구","이자바","010-1111-1111");
        addPhoneNo("친구","나자바","010-2222-2222");
        addPhoneNo("회사","박대리","010-3333-3333");
        addPhoneNo("회사","이과장","010-4444-4444");
        addPhoneNo("세탁", "02-111-1111");
        addPhoneNo("식당","02-000-0000");

        printList();
    }

    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(tel,name); //이름은 중복될 수 있으므로 전화번호를 key로 사용
    }

    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)){
            // HashMap 의 value 로 HashMap 저장 가능 -> 하나의 키에 복수 데이터 저장 가능
            phoneBook.put(groupName, new HashMap());
        }
    }

    static void addPhoneNo(String name, String tel){
        addPhoneNo("기타",name,tel); // default group
    }

    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();

            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");

            while(subIt.hasNext()){
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }
}
