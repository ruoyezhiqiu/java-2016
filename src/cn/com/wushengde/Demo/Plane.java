package cn.com.wushengde.Demo;

public class Plane {
	protected String name;
	protected String speed;
	protected double height;

	public Plane() {
		super();
	}

	public Plane(String name, String speed, double height) {
		super();
		this.name = name;
		this.speed = speed;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Plane [name=" + name + ", speed=" + speed + ", height=" + height + "]";
	}
	

}
