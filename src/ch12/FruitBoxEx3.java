package ch12;

class Juice {
	String name;

	Juice(String name){
		this.name = name + "Juice";
	}

	public String toString(){
		return name;
	}
}

class Juicer {
	static Juice makeJuice(FruitBox3<? extends Fruit> box) { //Fruit 와 자식들만 가능하도록 와일드 카드 상한 제한
		String tmp = "";
		
		for(Fruit f : box.getList()) {
			tmp += f + " ";
		}

		return new Juice(tmp);
	}
}

class FruitBox3<T extends Fruit> extends Box<T> {}

class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox3<Fruit> fruitBox = new FruitBox3<>();
		FruitBox3<Apple> appleBox = new FruitBox3<>();

		fruitBox.add(new Apple());
		fruitBox.add(new Grape());

		appleBox.add(new Apple());
		appleBox.add(new Apple());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}
}
