
package afterteacher;

/**
 * @author john
 * this关键字作用：
 * 1、如果出现同名的成员变量跟局部变量时，在方法内部默认是访问局部变量的数据，可以通过this关键字访问指定的成员变量；
 * 2、在一个构造函数中可以调用另一个构造函数的初始化成员对象。
 * this关键字调用其他的构造函数要注意的事项：
 * 1、this关键字调用其他的构造函数时，this关键字必须位于构造函数中的第一个语句（并非第一行）；
 * 2、this关键字在构造函数中不能出现相互调用的情况，因为这样会出现死循环；
 *
 */
public class Student {
	int id;//身份证号
	String name;//姓名
	public Student(){
		System.out.println("调用了无参的构造函数");
	}
	public Student(int id){
		this.id = id;
		System.out.println("调用了含有一个int类型的参数的构造函数");
	}
	public Student(String name){
		this.name = name;
		System.out.println("调用了含有一个String类型的参数的构造函数");
	}
	public Student(int id,String name){
		this(id);
		//this(name);不能出现在构造函数的第二个语句中。
		this.name = name;
		System.out.println("调用了含两个参数类型int,String的构造函数");
	}
	public void eat(){
		System.out.println("姓名:"+name+" 学号："+id+" 吃饭中...");
	}
	public static void main(String[] args) {
		Student s1 = new Student(100,"赵子龙");
		System.out.println(s1.name);
		s1.eat();
		Student s2 = new Student(101,"郭嘉");
		System.out.println(s2.name);
		s2.eat();
	}

}
