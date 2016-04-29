package afterteacher;
//只会天天学习的学生：
class Student9_8{
	String name;
	int id;
	String gender;
	public Student9_8(){
		
	}
	public Student9_8(String name,int id,String gender){
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	public void Study(){
		System.out.println(name+":好好学习，天天向上");
	}
}
//定义一个接口实现挣钱的的拓展关系:
interface Money{
	 void makeMoney();
}
//定义一个会挣钱的学生类：
class MoneyStudent extends Student9_8 implements Money{
	public MoneyStudent(String name,int id ,String gender){
		super(name,id,gender);
	}
	public void makeMoney(){
		System.out.println(name+":出去做兼职挣钱");
	}
}
public class Demo9_8 {

	public static void main(String[] args) {
		Student9_8 s1 = new Student9_8("张三", 5, "男");
		Student9_8 s2 = new Student9_8("李四", 8, "男");
		MoneyStudent s3 = new MoneyStudent("貂蝉", 8, "女");
		MoneyStudent s4 = new MoneyStudent("孙尚香", 18, "女");
		s1.Study();
		s2.Study();
		s3.Study();
		s3.makeMoney();
		s4.Study();
		s4.makeMoney();
	}

}
