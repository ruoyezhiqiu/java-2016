package cn.com.wushengde.Demo;

public class TestComputer {

	public static void main(String[] args) {
	Cpu cpu1 = new Cpu("core i7 6700K","4Ghz");
	Cpu cpu2 = new Cpu("core i5 4590", "3.3Ghz");
	
	Ram ram1 = new Ram("kingston","4G");
	Ram ram2 = new Ram("kingston","8G");
	
	Computer c1 = new Computer("河田", cpu1, ram1);
	Computer c2 = new Computer("河田", cpu2, ram2);
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	}

}
