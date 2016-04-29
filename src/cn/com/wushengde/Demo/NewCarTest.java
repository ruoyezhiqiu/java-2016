//定义一个车类，一个修理厂类，车具有一个跑的功能，但是跑之前会检查轮子是不是4个，如果少于4个就去修理厂修！
package cn.com.wushengde.Demo;
class NewCar{
	private String name;
	private String color;
	private int wheel;
	public NewCar() {
		super();
	}
	public NewCar(String name, String color, int wheel) {
		super();
		this.name = name;
		this.color = color;
		this.wheel = wheel;
	}
	@Override
	public String toString() {
		return "NewCar [name=" + name + ", color=" + color + ", wheel=" + wheel + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + wheel;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewCar other = (NewCar) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wheel != other.wheel)
			return false;
		return true;
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
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public void run(){
		if(this.wheel>=4){
			System.out.println(wheel+"个轮子的"+color+"色"+name+"跑车飞快的跑着，好潇洒....");
		}else{
			System.out.println(name+"轮子跑掉了，快去修理厂修理吧 ！！！");
		}
	}
	
}
class CarFactory{
	private String name;
	private String address;
	private String tel;
	public CarFactory() {
		super();
	}
	public CarFactory(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "CarFactory [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void repair(NewCar c){
		if(c.getWheel()<4){
			c.setWheel(4);
			System.out.println("本店："+this.getName()+"  地址："+this.getAddress()+"  电话："+this.getTel());
			System.out.println("你的车子已经修好了，请及时来领取，如有什么疑问，请随时联系我们！");
		}
	}
	
}
public class NewCarTest {

	public static void main(String[] args) {
		NewCar car01 = new NewCar();
		car01.setName("宝马");
		car01.setColor("红");
		car01.setWheel(4);
		NewCar car02 = new NewCar();
		car02.setName("法拉利");
		car02.setColor("蓝");
		car02.setWheel(4);
		for (int i = 0; i <=100; i++) {
			car01.run();
		}
		car01.setWheel(3);
		car01.run();
		CarFactory f = new CarFactory();
		f.setName("懒洋洋修车店");
		f.setAddress("北京市海淀区清华大学南门旁");
		f.setTel("000-1234567");
		f.repair(car01);
		car01.run();
		car02.run();
		car02.run();
		car02.run();

	}

}
