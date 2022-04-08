package ch12;

enum Transportation {
	BUS(100) {
		int fare(int distance) {
			return distance*BASIC_FARE+10;
		}
	},
	TRAIN(150) {
		int fare(int distance) {
			return distance*BASIC_FARE+20;
		}
	},
	SHIP(100) {
		int fare(int distance) {
			return distance*BASIC_FARE+30;
		}
	},
	AIRPLANE(300) {
		int fare(int distance) {
			return distance*BASIC_FARE+40;
		}
	};

	protected final int BASIC_FARE; //각 상수에서 접근할 수 있도록 protected
	
	Transportation(int basicFare) { // private
		BASIC_FARE = basicFare;
	}

	public int getBasicFare() {
		return BASIC_FARE;
	}

	abstract int fare(int distance); //추상메서드를 열거형에 추가 -> 각 상수는 정의해야함
}

class EnumEx3 {
	public static void main(String[] args) {
		System.out.println("bus fare=" +Transportation.BUS.fare(100));
		System.out.println("train fare=" +Transportation.TRAIN.fare(100));
		System.out.println("ship fare="+Transportation.SHIP.fare(100));
	    System.out.println("airplane fare="+Transportation.AIRPLANE.fare(100));
	}
}
