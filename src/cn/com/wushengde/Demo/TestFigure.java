package cn.com.wushengde.Demo;

public class TestFigure {

	public static void main(String[] args) {
		Figure f1 = new Triangle("三角形", 3.0, 4.0, 5.0);
		f1.area = f1.getArea();
		System.out.println(f1.area);
	}
}
