package Package_2;
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}
class Marine extends Unit {	//보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다 */ }
}
class Tank extends Unit {	//탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다 */ }
}
class Dropship extends Unit {	//수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ", y=" + y + "]");
	}
	void load() {System.out.println("20명을 태웠습니다");}
	void unload() {System.out.println("20명이 내렸습니다");}
}
public class Ex7_10 {

	public static void main(String[] args) {
//		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();		
		group[0].move(10, 20);
		group[1].move(100, 200);
		group[2].move(1000, 2000);
	}
}
