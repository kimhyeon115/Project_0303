package Package_2;
class car {
	String name;
	int price;
	car(String a, int b) {
		this.name = a;
		this.price = b;
	}
	public void gal() {}
}
class volvo extends car {
	volvo() {
		super("볼보",8000);
	}
}
class granger extends car  {
	granger() {
		super("그랜저",5000);
	}
}
class genesise extends car  {
	genesise() {
		super("제네시스",7000);	
	}
}
public class Test2 {
	public void allcar(car a) {
		a.gal();
		System.out.println(a.name + " 차종의 가격은 " + a.price + "만원 입니다");
	}
	public static void main(String[] args) {
		Test2 b = new Test2();
		b.allcar(new granger());
		b.allcar(new genesise());
		b.allcar(new volvo());
	}
}
