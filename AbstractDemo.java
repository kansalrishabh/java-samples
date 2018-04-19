// abstract class/method demo
public class AbstractDemo {
	public static void main(String[] args) {
		Shape shape = new Shape() {
			public void draw() {
				System.out.println("annonymous");
			}
		};
		shape.draw();
		System.out.println(shape.getArea());
	}
}