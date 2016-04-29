package afterteacher;
//需求：用父类引用定义子类对象，然后用父类引用调用子类特有的方法
class Animal10_1{
	private String name;
	public Animal10_1(){
	}
	public Animal10_1(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void run(){
		System.out.println("动物在跑");
	}
	
}
class Bird extends Animal10_1{
	public Bird(String name){
		super(name);
	}
	public void fly(){
		System.out.println(super.getName()+"在天空飞翔");
	}
}
class Fish10_1 extends Animal10_1{
	public Fish10_1(String name){
		super(name);
	}
	public void swim(){
		System.out.println(super.getName()+"在水里游来游去");
	}
}
public class Demo10_1 {

	public static void main(String[] args) {
		Animal10_1 a1 = new Bird("小鸟");
		Animal10_1 a2 = new Fish10_1("小鱼儿");
		print(a1);
		print(a2);
	}
	//此方法需要使用强制类型转换，将动物类型强制类型转换为相应的对象
	public static void print(Animal10_1 a){
		if(a instanceof Bird){
			Bird b = (Bird)a;
			b.fly();
		}
		if(a instanceof Fish10_1){
			Fish10_1 f = (Fish10_1)a;
			f.swim();
		}
		
	}

}
