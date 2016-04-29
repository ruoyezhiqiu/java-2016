package afterteacher;
//抽象类的应用：
abstract class Graph {
	public abstract void getPerimeter();
	public abstract void getArea();
}
//定义一个圆形：属于图形的一种
class Circle1 extends Graph {
	double raduis;
	public static final double PI = 3.14;

	public Circle1() {
	}

	public Circle1(double raduis) {
		this.raduis = raduis;
	}

	public void getPerimeter() {
		System.out.println("半径为：" + raduis + "的圆周长是:" + 2 * PI * raduis);
	}

	public void getArea() {
		System.out.println("半径为：" + raduis + "的圆面积是：" + PI * raduis * raduis);
	}
}
//定义一个矩形：属于一种图形
class Rectangle extends Graph{
	double length;
	double wide;
	public Rectangle(){
		
	}
	public Rectangle(double length,double wide){
		this.length = length;
		this.wide = wide;
	}
	public void getPerimeter(){
		System.out.println("长为："+length+"宽为："+wide+"的矩形周长是："+2*(length+wide));
	}
	public void getArea(){
		System.out.println("长为："+length+"宽为："+wide+"的矩形面积是："+length*wide);
	}
}

public class Demo9_3 {

	public static void main(String[] args) {
		Circle1 c = new Circle1(4.0);
		Rectangle r = new Rectangle(10.0, 10.0);
		c.getArea();
		c.getPerimeter();
		r.getArea();
		r.getPerimeter();
		
	}

}
