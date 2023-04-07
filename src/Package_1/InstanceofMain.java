package Package_1;
class Car77 { }
class FireEngine77 extends Car77 {
	void dowork(Car77 c) {						
		if(c instanceof FireEngine77) {			// c = new FireEngine77(); 가능여부 확인
			FireEngine77 fe = (FireEngine77)c;	// 가능시 다운캐스팅
			fe.water();
		}
	}
	void water() {
		System.out.println("water!!!");
	}
}
class Ambulance extends Car77 { }
public class InstanceofMain {

	public static void main(String[] args) {
		FireEngine77 f = new FireEngine77();
		f.dowork(f);
		System.out.println(f instanceof Car77);
		System.out.println(f instanceof Object);
		System.out.println(f instanceof FireEngine77);
		
		Object obj = (Object)f;
		System.out.println(obj instanceof FireEngine77);
		Car77 c = (Car77)f;
	}

}
