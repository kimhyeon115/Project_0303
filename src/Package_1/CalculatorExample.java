package Package_1;
class Calculator {
	double areaRectangle(int width) {
		return width * width;
	}
	double areaRectangle(double width, int height) {
		return width * height;
	}
}
class CalculatorExample {
	public void SomeAnimal(Calculator a) {
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		double result1 = c.areaRectangle((int)10.0);
		System.out.println(result1);
		System.out.println(c.areaRectangle(10, (int)8.5));
	}

}
