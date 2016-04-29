package afterteacher;
//模板练习：定义一个计算一段程序运行所用的时间是多长：
public abstract class Demo11_8 {

	public final void getTime(){
		long start =System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println("此程序运行所花时间为："+(end-start)+"毫秒");
		
	}
	public abstract void code();

}
class TestDemo11_8 extends Demo11_8{
	public static void main(String[] args) {
		TestDemo11_8 t = new TestDemo11_8();
		t.getTime();
	}

	@Override
	public void code() {
		long sum=0;
		for (long i = 0; i<=10000000; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	 
}
