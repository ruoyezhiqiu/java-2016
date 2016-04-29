package lesson;

//递归的练习：计算一个数的阶乘
public class Demo4_14_8 {

	public static void main(String[] args) {
		System.out.println(recursive(5));
	}

	public static int recursive(int i) {
		if (i == 1) {
			return i;
		} else {
			return i * recursive(i - 1);
		}
	}

}
