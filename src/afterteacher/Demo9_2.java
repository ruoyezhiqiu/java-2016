package afterteacher;
class Circle{
	double raduis;
	//修饰一个常量最普通的做法：public static final
	public static final double PI = 3.14;
	public Circle(){
		
	}
	public Circle(double raduis) {
		super();
		this.raduis = raduis;
	}
	public final void getArea(){
		System.out.println("圆的面积是："+raduis*raduis*PI);
	}
}
public class Demo9_2 extends Circle {

	public Demo9_2(double raduis){
		super(raduis);
	}
	
/*	
 *当父类中的方法被设置为final修饰符时,子类不能重写这个方法。
 * public void getArea()
	{
		System.out.println("我是一个圆，哈哈，猜猜看我的半径是多少啊！");
	}*/
	public static void main(String[] args) {
		Circle c = new Demo9_2(4.0);
		c.getArea();
		test(c);
	}
	public static void test(Circle c){
		c = new Circle(5.0);
		c.getArea();
	}
}
