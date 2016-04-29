package afterlesson;

import java.util.Scanner;

//递归练习：
public class Demo4_14_2 {

	public static void main(String[] args) {
		System.out.println("请输入一个要求阶乘的数:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (x <= 0) {
			System.out.println("请输入一个大于0的整数");
		} else {
			System.out.println(x+"的阶乘是："+recursion(x));
		}
		scanner.close();

	}
//	递归求阶乘的方法：
	public static int recursion(int n) {
		if (n == 1) {
			return 1;
		} else if (n <= 0) {
			return -1;
		} else {
			return recursion(n - 1) * n;
		}
	}

}
