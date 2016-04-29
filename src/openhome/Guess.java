package openhome;
import java.util.Scanner;
//定义一个类，实现猜数字游戏：
public class Guess {

	public static void main(String[] args) {
		//定义一个Scanner的对象：
		Scanner scanner = new Scanner(System.in);
		int number = (int)(Math.random()*10);
		int guess;
		
		do
		{
			System.out.print("猜数字（0-9）：");
			guess = scanner.nextInt();
		}while(guess!=number);
		
		System.out.println("猜中了...XD");
		scanner.close();
	}

}
