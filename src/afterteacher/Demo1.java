/**成员变量 代码块  构造函数的执行顺序：构造函数始终都是最后执行的，
成员变量的声明始终都是在构造函数的第一步，但是成员变量的赋值与代码块的赋值是顺序
是谁在前面谁先执行！ 可以使用反编译工具：命令检测：javap -c -l -private Demo1*/
package afterteacher;

public class Demo1 {


	{
		i = 2000000;
	}
	int i = 1000000;

	public Demo1() {
		i = 3000000;
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.i);
	}

}
