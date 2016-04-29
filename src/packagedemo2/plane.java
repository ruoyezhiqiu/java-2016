package packagedemo2;

public class plane implements Moveable,Flyable {
	private String name;
	
	public plane() {
		super();
	}

	public plane(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+"正在跑道上移动！");
	}

	@Override
	public void fly() {
		System.out.println(name+"在天上飞来飞去");
		
	}

}
