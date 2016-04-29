package cn.com.wushengde.Demo;

public class Rectangle extends Figure {
	private double chang;
	private double wide;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double chang, double wide) {
		super();
		this.chang = chang;
		this.wide = wide;
	}

	public Rectangle(String name,double chang, double wide) {
		super(name);
		this.chang = chang;
		this.wide = wide;	
	}

	@Override
	public double getArea() {
		return chang*wide;
	}

}
