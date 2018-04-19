public class DotThisSuper {
	public static void main(String[] args) {
		Chile c = new Child(50);
		Child.Inner i = c.new Inner();
		i.show();
	}
}