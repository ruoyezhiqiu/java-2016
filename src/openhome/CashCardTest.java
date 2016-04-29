package openhome;
//引入java.util.Scanner包。方便使用Scanner（）方法实现获取控制台输入值：
import java.util.Scanner;
public class CashCardTest {
	public static void main(String[] args)
		{
		//创建一个scanner的一个对象：
		Scanner scanner = new Scanner(System.in);
		
		CashCard card1 = new CashCard("A001", 1500, 0);
		CashCard card2 = new CashCard("A002", 1000, 0);
		CashCard card3 = new CashCard("A003", 500, 0);
		CashCard card4 = new CashCard("A004", 2000, 0);
		System.out.println("请输入存款：");
 		card1.store(scanner.nextInt());
		System.out.println("请输入存款：");
		card2.store(scanner.nextInt());
		System.out.println("请输入存款：");
		card3.store(scanner.nextInt());
		System.out.println("请输入存款：");
		card4.store(scanner.nextInt());
	
		System.out.printf("明细  (%s,%d,%d)%n",card1.getNumber(),card1.getBalance(),card1.getBonus());
		System.out.printf("明细  (%s,%d,%d)%n",card2.getNumber(),card2.getBalance(),card2.getBonus());
		System.out.printf("明细  (%s,%d,%d)%n",card3.getNumber(),card3.getBalance(),card3.getBonus());
		System.out.printf("明细  (%s,%d,%d)%n",card4.getNumber(),card4.getBalance(),card4.getBonus());
		
		scanner.close();
		
		}
		
}
