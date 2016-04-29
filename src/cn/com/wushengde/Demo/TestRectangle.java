package cn.com.wushengde.Demo;

public class TestRectangle {

	public static void main(String[] args) {
		Figure f = new Rectangle("长方形", 10.0, 10.0);
		f.area =f.getArea();
		System.out.println(f.area);
	}
}
