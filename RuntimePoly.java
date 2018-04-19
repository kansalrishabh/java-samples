public class RuntimePoly {
	public static void main(String[] args) {
		Shape shape = null;

		shape = new Rectangle();
		shape.draw();
		System.out.println(shape.getArea());

		shape = new Trapezium();
		shape.draw();
		System.out.println(shape.getArea());

		System.out.println(((Trapezium) shape).getHeight());
		System.out.println(((Trapezium) shape).getLenOne());
		
	}
}