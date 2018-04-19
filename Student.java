public class Student {
	String name;
	int age;
	char sex;

	public Student(String name, int age, char sex) {
		this.name = name + "x1";
		this.age = age;
		this.sex = sex;

		System.out.println(this.name + "(" + this.age + ")" + this.sex);
	}

	public Student(String name, int age) {
		this(name, age, 'M');
		System.out.println(this.name + "(" + this.age + ")");
	}
}