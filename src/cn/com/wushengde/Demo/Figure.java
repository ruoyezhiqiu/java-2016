package cn.com.wushengde.Demo;

public abstract class Figure {
	protected double area;
	protected String name;
	public Figure() {
		super();
	}
	public Figure(String name) {
		super();
		this.name = name;
	}

	public Figure(double area, String name) {
		super();
		this.area = area;
		this.name = name;
	}
	public abstract double getArea();
	@Override
	public String toString() {
		return "Figure [area=" + area + ", name=" + name + "]";
	}
}
