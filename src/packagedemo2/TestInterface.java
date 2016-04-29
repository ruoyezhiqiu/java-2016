package packagedemo2;

public class TestInterface {
	public static void main(String[] args) {
		Moveable m1 = new Person("赵云",20);
		m1.run();
		m1 = new plane("客机");
		m1.run();
		m1 = new Bird("喜鹊","红色");
		m1.run();
		Flyable f1 = new plane("客机");
		f1.fly();
	}
}
