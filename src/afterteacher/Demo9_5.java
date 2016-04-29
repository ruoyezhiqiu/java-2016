package afterteacher;

/**
 * @author Administrator
 *需求：定义一个函数实现将两个基本数据的值交换
 */
public class Demo9_5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("交换之前的值:a="+a+",b="+b);
		exchange(a, b);
		System.out.println("交换之后的值:a="+a+",b="+b);
	}
	public static void exchange(int a,int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("函数内部交换后的值:a="+a+",b="+b);
	}

}
