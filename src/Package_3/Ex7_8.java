package Package_3;
class Fruit {
	String name;
	int price;
	int count;
	Fruit(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
}
class peach extends Fruit {
	peach() {
		super("복숭아",2000,5);
	}
	public String toString() { return "복숭아";}
}
class wattermellon extends Fruit {
	wattermellon() {
		super("수박",10000,2);
	}
	public String toString() { return "수박";}
}
class banana extends Fruit {
	banana() {
		super("바나나",5000,5);
	}
	public String toString() { return "바나나";}
}
class buyer {
	int money = 100000;
	public void buy(Fruit a) {
		if(money < a.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= (a.price*a.count);
		System.out.println("단가 " + a.price + "원짜리 " + a + " " + a.count + "개를 " + (a.price * a.count) + "만큼 구매 하였습니다");
	}
}
public class Ex7_8 {
	public static void main(String[] args) {
		buyer b = new buyer();
		b.buy(new peach());
		b.buy(new wattermellon());
		b.buy(new banana());
		System.out.println("현재 남은 잔액은 " + b.money + "입니다");
	}
}
