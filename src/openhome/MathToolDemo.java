package openhome;
	//定义一个类，类中实现定义不定长度参数的定义，使用增强式for循环，实现对该函数中的内容进行遍历处理：
public class MathToolDemo {

	public static void main(String[] args) {
	System.out.println(MathToolDemo.sum(1,2,3,4));
	System.out.println(MathToolDemo.sum(1,2,3,4,5,6));
	System.out.println(MathToolDemo.sum(1,2,3,4,5,6,7,8));
	System.out.println(MathToolDemo.sum(1,2,3,4,5,6,7,8,9));
	
	Ball b1 = new Ball(1); Ball b9 = new Ball();
	Ball b2 = new Ball(1); Ball b10 = new Ball();
	Ball b3 = new Ball(1); Ball b11 = new Ball();
	Ball b4 = new Ball(1); Ball b12 = new Ball();
	
	Ball b5 = new Ball(10);
	Ball b6 = new Ball(10);
	Ball b7 = new Ball(10);
	Ball b8 = new Ball(10);
	System.out.println(getBalls(b1,b2,b3,b4));
	System.out.println(getBalls(b5,b6,b7,b8));
	System.out.println(getBalls(b9,b10,b11,b12));
	}
	//定义不定长度自变量，即定义参数不定长度函数，即：参数部分是个数组的形式：
	public static int sum(int...numbers){
		int sum = 0;
	//使用增强式for循环，遍历数组中的每个元素：
		for(int number:numbers){
			sum+=number;
		}
		return sum;
	}
	//定义一个带有不定个数的Ball类型的参数的函数，计算调用该方法时传入的所有ball的圆面积之和的方法：
	public static double getBalls(Ball...balls){
		double sum = 0.0;
		for(Ball ball:balls){
			sum+=ball.radius*ball.radius*Ball.PI;
		}
		return sum;
	}
}

