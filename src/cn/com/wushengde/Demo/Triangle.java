package cn.com.wushengde.Demo;

public class Triangle extends Figure {
	private double a;
	private double b;
	private double c;

	public Triangle() {
		super();
	}
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle(String name, double a, double b, double c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		Double s = 0d;
		Double p = (a + b + c) / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

}
