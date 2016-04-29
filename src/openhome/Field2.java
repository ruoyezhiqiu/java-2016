package openhome;
//定义一个Clothes2类：
class Clothes2{
	//定义两个实例变量：color,size。
	String color;
	char size;
	//定义一个带有两个String类型和char类型的参数的构造函数。
	Clothes2(String color,char size){
		this.color = color;
		this.size = size;
	}
}
//定义一个公开类Field2。
public class Field2 {

	public static void main(String[] args) {
		//使用构造函数创建对象。
		Clothes2 sun = new Clothes2("red", 'S');
		Clothes2 spring = new Clothes2("green", 'M');
		
		System.out.printf("sun (%2$s,%1$c)%n",sun.size,sun.color);
		System.out.printf("spring (%s,%c)%n",spring.color,spring.size);
	}

}
