package afterteacher;

//内部类的方法的调用方式，以及内部类的在其他类中的创建对象的方式：
class Outer {
	static int x = 10;

	static class Inner {
		static int y = 20;

		public void print() {
			System.out.println("这是内部类的print方法" + y);
		}
	}

	public void instance() {
		Inner inner = new Inner();
		inner.print();
	}
}

public class Demo10_3 {

	public static void main(String[] args) {
		// 以下是两种调用内部类的方法的形式：
		/*
		 * Outer.Inner inner= new Outer().new Inner(); inner.print();
		 */
		Outer.Inner inner = new Outer.Inner();
		inner.print();
		Outer outer = new Outer();
		outer.instance();
	}

}
