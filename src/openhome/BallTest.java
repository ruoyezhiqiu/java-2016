package openhome;
class Ball{
	double radius;
	static double d;
	//定义一个static的类成员：final表示PI值不能修改！
	static final double PI = 3.14;
	
	/*	
 	//不能将this用在static中，因为static表示的就是Ball类中的部分。
	static void doSort(){
		double i =this.radius;
	}*/
	Ball(){
		radius = 20;
	}
	Ball(double d){
		this.radius = d;
	}
	static double doOther(double x){
	   return x*PI;
	}
	static void doSort(){
		
	}
}
public class BallTest {

	public static void main(String[] args) {
		

	}

}
