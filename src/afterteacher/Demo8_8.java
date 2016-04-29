package afterteacher;
//考查：instanceof的用法，一般instanceof用在多态中最多。
class Animal{
	String name;
	String color;
	public Animal(){
		
	}
	public Animal(String name,String color){
		this.name = name;
		this.color = color;
	}
}
class Fish extends Animal{
	public Fish(String name,String color){
		super(name,color);
	}
	public void swim(){
		System.out.println(color+"的"+name+"在海里游来游去！！！");
	}
}
class Mouse extends Animal{
	public Mouse(String name,String color){
		super(name,color);
	}
	public void dig(){
		System.out.println(color+"的"+name+"在山坡上挖洞！！！");
	}
}
public class Demo8_8 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Fish f = new Fish("大白鲨", "红色");
		Mouse m = new Mouse("鼹鼠","灰色");
		f.swim();
		m.dig();
		System.out.println("大白鲨是动物吗？"+(f instanceof Animal));
		System.out.println("鼹鼠是动物吗？"+(m instanceof Animal));
		System.out.println("动物是大白鲨吗？"+(a instanceof Fish));
		System.out.println("动物是鼹鼠吗？"+(a instanceof Mouse));
		
	}

}
