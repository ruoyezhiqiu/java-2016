package afterteacher;

/**
 * @author Administrator static的练习： 需求：实现统计对象的创建次数，并将这个次数显示出来。
 *
 */
class Teacher {
	static int count = 0;// 计数器，此处不能使用非静态成员来计数！用于统计对象创建的次数。count为非静态变量，只能使用对象调用。
	private String name;//name为非静态变量，只能使用对象调用。
	private int age;//age为非静态变量，只能使用对象调用。
	private String major;//major为非静态变量，只能使用对象调用。
	{
		count++;
	}
	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	public void getCount(){
		System.out.println(count);
	}

}

public class StaticTest {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("张三", 20, "计算机");
		Teacher t2 = new Teacher("李四", 20, "数学");
		Teacher t3 = new Teacher("王二", 20, "物理");
		Teacher t4 = new Teacher("麻子", 20, "天文学");
		System.out.println("一共创建了" + Teacher.count + "个对象，他们分别是：");
		System.out.print(t1.getName()+",");
		System.out.print(t2.getName()+",");
		System.out.print(t3.getName()+",");
		System.out.println(t4.getName());
		t4.getCount();
		Teacher t5 = new Teacher("陈七", 25, "宇宙学");
		System.out.println(t5.getName());
		t5.getCount();

	}

}
