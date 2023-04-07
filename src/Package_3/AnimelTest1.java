package Package_3;
class Animel {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}
class Human extends Animel {
	public void move( ) {
		System.out.println("이 두 발로 걷습니다");
	}
	public void readBook() {
		System.out.println("이 책을 읽습니다");
	}
	public String toString() {
		return "사람";
	}
	
}
class Tiger extends Animel {
	public void move() {
		System.out.println("가 네 발로 뜁니다");
	}
	public void hunting() {
		System.out.println("가 사냥을 합니다");
	}
	public String toString() {
		return "호랑이";
	}
}
class Eagle extends Animel {
	public void move() {
		System.out.println("가 하늘을 납니다");
	}
	public void flying() {
		System.out.println("가 날개를 쭉 펴고 멀리 납니다");
	}
	public String toString() {
		return "독수리";
	}
}
public class AnimelTest1 {
	public void moveAnimel(Animel animel) {
		System.out.print(animel);
		animel.move();
	}
	public static void main(String[] args) {
//		Animel animel;						//Animel animel = new Human(); 한줄로 표기시
//		animel = new Human();
		AnimelTest1 at = new AnimelTest1();
		at.moveAnimel(new Human());			//Animel animel = new Human();
		at.moveAnimel(new Tiger());
		at.moveAnimel(new Eagle());
	}

}
