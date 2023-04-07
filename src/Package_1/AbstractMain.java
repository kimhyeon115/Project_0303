package Package_1;
abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos + "회 반복하세요");}
	void stop() {System.out.println("그만 스톱합니다");}
}
public class AbstractMain {

	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer();
		Player ap2 = new AudioPlayer();
		ap.play(50);
		ap.stop();
		ap2.play(30);
		ap2.stop();
	}

}
