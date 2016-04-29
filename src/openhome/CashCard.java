//标明此java源文档存在于openhome包中：
package openhome;
//定义一个类CashCard:
class CashCard
{
//将类的实例变量定义为：private，防止外部直接调用：
private	String number;
private	int balance;
private	int bonus;
//定义一个构造函数，属于对象封装中的对象初始化封装：
CashCard(String number,int balance,int bonus){
		this.number = number;
		this.balance =balance;
		this.bonus =bonus;
	}
//定义一个方法，实现化繁为简，属于对象的流程封装：
void store(int money){
		if(money>0){
			this.balance+=money;
			if(money>=1000){
				this.bonus++;
			}
		}
		else{
			System.out.println("存储的是负数，请重新输入！");
		}
	}
//定义方法getNumber(),getBalance(),getBonus();实现对private的访问：
String getNumber(){
	return this.number;
}
int getBalance(){
	return this.balance;
}
int getBonus(){
	return this.bonus;
}

}
