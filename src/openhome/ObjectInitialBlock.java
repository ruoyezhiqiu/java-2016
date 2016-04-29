//用package声明该类的包名：openhome
package openhome;
//定义一个Other类：
class Other{
	//创建对象后，调用构造函数前，执行以下{}内的代码！
	{
	System.out.println("对象初始区块");
	}
	//定义一个不含参数的构造函数：
	Other(){
		System.out.println("Other() 构造函数");
	}
	//定义一个包含一个int 类型的构造函数：
	Other(int o){
		//调用了Other（）构造函数，其中this指的是对象本身，即：Other this = new Other。
		this();
		System.out.println("Other(int o) 构造函数");
	}
	
	
}
//定义一个公开类，其中包含mian()方法，是程序执行的入口：
public class ObjectInitialBlock {

	public static void main(String[] args) {
		//创建一个类的实例（对象）调用了Other（）构造函数。
		new Other(1);
		
		int x = 200;
		int y = 200;
		Integer wx = x;
		Integer wy = y;
		System.out.println(x==wx);
		System.out.println(y==wy);
		

	}
}
