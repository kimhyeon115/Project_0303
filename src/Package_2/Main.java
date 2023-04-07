package Package_2;
abstract class Animal {
	abstract void crying();
}
class Cat extends Animal {
	void crying() {
		System.out.println("야옹 야옹!!");		
	}
}
class Dog extends Animal {
	void crying() {
		System.out.println("멍 멍!!");
	}
}
class pigeon extends Animal {
	void crying() {
		System.out.println("구구 구~");
	}
}
public class Main {
	public void SomeAnimal(Animal a) {
		a.crying();
	}
	
	public static void main(String[] args) {
		 Main mm = new Main();
		 mm.SomeAnimal(new pigeon());
		 mm.SomeAnimal(new Dog());
		 mm.SomeAnimal(new Cat());
	}
}

