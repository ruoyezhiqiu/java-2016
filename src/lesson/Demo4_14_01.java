package lesson;
/*需求：计算输入的两个数的最大公约数跟最小公倍数：
 * 思路：使用辗转相除的方法计算最大公约数，利用公式计算最小公倍数；
 * */
import java.util.Scanner;

public class Demo4_14_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int m = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		int n = scanner.nextInt();
		System.out.println(m + "," + n + "的最大公约数是：" + getMaxCommon(m, n));
		System.out.println(m + "," + n + "的最小公倍数数是：" + getMinCommon(m, n));
		scanner.close();

	}
//此处利用辗转相除法：计算两个数的最大公约数：
	public static int getMaxCommon(int m, int n) {
		int common = getMax(m, n);
		if (m == n || m == 0 || n == 0) {
			return common;
		} else {
			int max = getMax(m, n);
			int min = getMin(m, n);
			int temp = max % min;
			while (temp != 0) {
				max = min;
				min = temp;
				temp = max % min;
			}
			return min;
		}
	}
	public static int getMinCommon(int m,int n){
		return m*n/getMaxCommon(m,n);
	}
	public static int getMax(int m, int n) {
		return (m > n) ? m : n;
	}

	public static int getMin(int m, int n) {
		return (m > n) ? n : m;
	}

}
