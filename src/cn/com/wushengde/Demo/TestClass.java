package cn.com.wushengde.Demo;

public class TestClass {

	public static void main(String[] args) {
		Class c1 = new Class();
		Class c2 = new Class();
		Class c3 = new Class();
		Class c4 = c1;
		c1.setName("计算机");
		c1.setAddress("第五教学楼");
		c1.setTime("2016-04-06");
		c1.setTeacher("杜老师");
		c1.setMax(200);

		c2.setName("数学");
		c2.setAddress("第三教学楼");
		c2.setTime("2016-04-06");
		c2.setTeacher("");
		c2.setMax(2000);

		c3.setName("物理");
		c3.setAddress("第八教学楼");
		c3.setTime("2016-04-06");
		c3.setTeacher("李志佳博士");
		c3.setMax(200);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println(c1 == c4);

	}

}
