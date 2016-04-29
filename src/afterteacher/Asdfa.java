package afterteacher;
//模板模式：需求，计算运行一段程序所用的时间,并设计这个模板。
public abstract class Asdfa {
	public final void getTime(){
		long start =System.currentTimeMillis();
		code();
		long end= System.currentTimeMillis();
		System.out.println("这段程序运行所用的时间是："+(end-start));
	}
	public abstract void code();

}
class Dnew extends Asdfa{
	public static void main(String[] args) {
		Dnew d = new Dnew();
		d.getTime();
	}
	public void code(){
		int i = 0;
		while(i<10000){
			System.out.println("i="+i);
			i++;
		}
	}
}
