package afterteacher;

/**
 * Created by john on 2016/4/16.
 */
//定义一个异常：在调用吃饭方法的时候，如果没有带够10元钱，就抛出此异常。
class NoEnoughMoneyException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoEnoughMoneyException(){

    }
    public NoEnoughMoneyException(String message){
        super(message);
    }
}
public class Demo11_1 {
    public static void main(String[] args) {
        double money = 5.0;
        try {
            eat(money);
        } catch (NoEnoughMoneyException e) {
            e.printStackTrace();
            System.out.println("赶快回去问你父母要钱吧，看他们会不会打你屁股！");
        }
    }
    public static void eat(double money) throws NoEnoughMoneyException{
        if(money<10.0){
            throw new NoEnoughMoneyException("孩子，你没有带够钱呢！");
        }
        else{
            System.out.println("你有的是钱，你可以在我们店随便吃！");
        }
    }
}
