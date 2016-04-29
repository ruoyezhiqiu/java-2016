package openhome;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("0.1");
		BigDecimal b = new BigDecimal("0.1");
		BigDecimal c = a;
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(c==a);
		Integer i = Integer.valueOf(100);
		int j = i.intValue();
		double d = i.doubleValue();
		System.out.println(j);
		System.out.println(d);
		/*
		Integer k = Integer.valueOf("A");
		int m = k;
		System.out.println(m);
		*/
/*		Integer i1 = 100;
		Integer i2 = 100;
		
		if (i1==i2) {
			System.out.println("i1==i2");
		}
		else{
			System.out.println("i1!=i2");
			
		}*/
/*		//即：Integer i1 = Integer.valueOf(200); 此处参考Integer的valueOf（）方法！其中含有：cache（缓存区）。IntegerCache是Integer类中的一个类。缓存会在首次使用IntegerCache时建立！
		Integer i1 = 200;
		//即：Integer i2 = Integer.valueOf(200); 此处参考Integer的valueOf（）方法！其中含有：cache（缓存区）。IntegerCache是Integer类中的一个类。缓存会在首次使用IntegerCache时建立！
		Integer i2 = 200;
		
		if (i1==i2) {
			System.out.println("i1==i2");
		}
		else{
			System.out.println("i1!=i2");
			
		}
		
		Integer i3 = new Integer(200);
		Integer i4 = new Integer(200);
		if (i3==i4) {
			System.out.println("i3==i4");
		}
		else{
			System.out.println("i3!=i4");
			
		}*/
		
		int x = 100;
		int y = 100;
		
		Integer wx = x;//等价于：Integer wx = Integer.valueOf(x);要判断Integer中的IntegerCache.low与IntegerCache.high的范围，默认是：-128 - 127，可以更改。
		Integer wy = y;//等价于：Integer wy = Integer.valueOf(y);要判断Integer中的IntegerCache.low与IntegerCache.high的范围，默认是：-128 - 127，可以更改。
		System.out.println(x==wx);
		System.out.println(y==wy);
		System.out.println(wx.equals(x));
		System.out.println(wy.equals(y));
		System.out.println(x==y);
		System.out.println(wx==wy);
	}

}
