package ch12;

import java.util.ArrayList;

class Fruit{
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}

class Grape extends Fruit{
    public String toString(){
        return "Grape";
    }
}

class Toy{
    public String toString(){
        return "Toy";
    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item){
        list.add(item);
    }

    T get(int i){
        return list.get(i);
    }

    ArrayList<T> getList(){
        return list;
    }

    int size(){
        return list.size();
    }

    public String toString(){
        return list.toString();
    }
}
class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
//        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();
        // Box<Grape> grape = new Box<Apple>(); //매개변수화된 타입이 불일치 -> 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); //add 메소드의 매개변수가 부모의 타입이므로 자식 타입 가능

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Fruit()); //부모 타입을 담을 수 없음
        //appleBox.add(new Toy()); //Apple 만 담을 수 잇음

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}
