package packagedemo2;

public class Bird implements Moveable {
	private String name;
	private String color;
	
	public Bird() {
		super();
	}

	public Bird(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + "]";
	}

	@Override
	public void run() {
		System.out.println(color+"的"+name+"在地上跑来跑去");
		

	}

}
