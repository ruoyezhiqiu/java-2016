package cn.com.wushengde.Demo;

public class Circle extends Figure {
	private double radius;
	private static final double PI=3.1415926;
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String name,double radius) {
		super(name);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return radius*radius*PI;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
