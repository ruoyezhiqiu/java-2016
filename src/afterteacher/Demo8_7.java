package afterteacher;
class Studenta{
	String name;
	public Studenta(){
		
	}
	public Studenta(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name+"学习马克思列宁主义");
	}
}
class BaseStudent extends Studenta{
	public BaseStudent(String name){
		super(name);
		}
	public void study(){
		System.out.println(name+"学习javase课程...");
	}
}
class WorkStudent extends Studenta{
	public WorkStudent(String name){                                                                                                              
		super(name);
	}
	public void study(){
		super.study();
		System.out.println(name+"学习javaee课程...");
	}
}
public class Demo8_7 {

	public static void main(String[] args) {
		BaseStudent b1 = new BaseStudent("张三");
		WorkStudent w1 = new WorkStudent("李四");
		b1.study();
		w1.study();
	}

}
