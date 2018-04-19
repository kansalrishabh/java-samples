public class InnerClass {
	public static void main(String[] args) {
		/*Person p = new Person();
		Person.Address add = p.new Address();
		Person.Address add = new Person().new Address();
		*/
		Person.Address add = new Person.Address();
		//System.out.println(p.name);
		//System.out.println(p.age);
		//System.out.println(p.gender);
		System.out.println(add.streetNo);
		new Person().localClass();
	}
}




















