package lesson;

import java.io.IOException;

//异常处理练习：
public class Demo4_15_1 {

	private int i = 2;

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		y = 0;
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = "hello world";
		try {

//			 此语句属于ArithmeticException：算术异常
			 System.out.println(x/y);

			// 此语句属于ArrayIndexOutOfBoundsException:数组索引越界异常
			 System.out.println(arr[10]);

			// 此语句属于StringIndexOutOfBoundsException:字符串索引越界异常
			 System.out.println(str.charAt(11));

			// 此语句属于NullPointerException:空指针异常
			Demo4_15_1 demo = new Demo4_15_1();
//			demo = null;
			System.out.println(demo.i);

		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally语句总是被执行！");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			myException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("异常处理结束！");

	}
	public static void myException() throws IOException{
		System.out.println("这是一个受检异常的方法");
	}

}
