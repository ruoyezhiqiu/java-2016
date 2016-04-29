package cn.com.wushengde.Demo;

public class TestCirlce {

	public static void main(String[] args) {
		Figure f = new Circle("圆", 10.0);
		f.area = f.getArea();
		System.out.println(f.area);
	}
}
