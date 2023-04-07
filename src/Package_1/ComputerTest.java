package Package_1;
abstract class Computer {
	public abstract void display();		//추상 메소드
	public abstract void typing();		//추상 메소드
	
	public void turnOn() {				//일반 메소드
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {				//일반 메소드
		System.out.println("전원을 끕니다");
	}	
}
abstract class NoteBook extends Computer {
	public void display() {
		System.out.println("NoteBook display");		
	}	
}
class MyNoteBook extends NoteBook {
	public void typing() {
		System.out.println("NoteBook typing");		
	}	
}
class DeskTop extends Computer {
	public void display() {
		System.out.println("DeskTiop display");
	}
	public void typing() {
		System.out.println("DeskTop typing");
	}	
}
abstract class OverAbstract {
	public void turnOn7() {				//일반 메소드
		System.out.println("전원을 켭니다");
	}
	public void turnOff7() {				//일반 메소드
		System.out.println("전원을 끕니다");
	}
}
class Aclas extends OverAbstract { 
	public void turnOn7() {
		System.out.println("전원을 조금 켭니다");
	}
}
public class ComputerTest {	
	public static void main(String[] args) {
		Computer c2 = new DeskTop();		//업캐스팅(다형성)
		Computer c4 = new MyNoteBook();		//업캐스팅(다형성)
		c2.display();
		c4.display();
		c2.turnOn();
		c4.turnOn();
	}
}