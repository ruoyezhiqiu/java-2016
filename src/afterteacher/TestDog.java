package afterteacher;

class Dog {
	String name;
	int age;
	static String country = "中国";

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
}

public class TestDog {
	public static void main(String[] args) {
		Dog d1 = new Dog("小花狗", 12);
		Dog d2 = new Dog("小白狗",15);
/*		System.out.println(d1.country);
		System.out.println(d2.country);*/	
		Dog.country = "美国";
		System.out.println(d1.toString());
		System.out.println(d2.toString());
/*		System.out.println(d1.country);
		System.out.println(d2.country);*/
	}
}
