package Package_2;
class Fruit {
	String name;
	int price;
	int count;
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("수량 : " + count);
	}
}
class peach extends Fruit {
	peach() {
		name = "복숭아";
		price = 2000;
		count = 5;
	}
}
class watermellon extends Fruit {
	watermellon() {
		name = "수박";
		price = 10000;
		count = 2;
	}
}
class banana extends Fruit {
	banana() {
		name = "바나나";
		price = 5000;
		count = 5;
	}
}
public class Test {
	void Cheri(Fruit ff) {
		ff.show();
	}
	public static void main(String[] args) {
		Test ss = new Test();
		ss.Cheri(new peach());
		ss.Cheri(new watermellon());
		ss.Cheri(new banana());
	}

}
