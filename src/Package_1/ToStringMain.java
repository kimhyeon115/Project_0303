package Package_1;
class person {
	private String name;
	int age;
	static int height;
	public String toString() {
		return "rlagus";
	}
}
class Student extends person {
	int weight;
}
public class ToStringMain {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st);				//toString() 생략되었음
		System.out.println(st.toString());
	}

}
