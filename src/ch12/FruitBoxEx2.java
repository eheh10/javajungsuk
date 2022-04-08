package ch12;

class Fruit2 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}
class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class Toy2 {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {

}

class FruitBox<T extends Fruit2 & Eatable> extends Box<T> {  //Fruit 자식이면서 Eatable 인터페이스 구현

}

class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit2> fruitBox = new FruitBox<>();
        FruitBox<Apple2> appleBox = new FruitBox<>();
        FruitBox<Grape2> grapeBox = new FruitBox<>();

        // 상속관계여도 일치해야한다
//        FruitBox<Grape2> grape = new FruitBox<Apple>();
//        FruitBox<Apple2> apple = new FruitBox<Grape2>();

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());

        appleBox.add(new Apple2());
//		appleBox.add(new Grape());  // Grape는 Apple의 자식이 아님

        grapeBox.add(new Grape2());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }
}

