package afterteacher;

public class People {
	private int id;
	private String name;
	private int age;
	
	public People() {
		super();
	}

	public People(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		if (age>0&&age<200) {
			this.age = age;
		}
		else{
			
			System.out.println("您输入的年龄不合法，请重新输入");
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		if (age>0&&age<200) {
			this.age = age;
		}
		else{
			System.out.println("您输入的年龄不合法，请重新输入");
		}
	}
	//比较年龄的方法
	public void compareAge(People p){
		if ((this.age>0&&this.age<200)&&(p.age>0&&p.age<200)) {
			
		
			if(this.age>p.age){
				System.out.println(this.age+"岁的"+this.name+"比"+p.age+"岁的"+p.name+"的年龄大");
			}
			else if (this.age==p.age) {
				System.out.println(this.age+"岁的"+this.name+""+p.age+"岁的"+p.name+"同龄");
			}
			else{
				System.out.println(this.age+"岁的"+this.name+"比"+p.age+"岁的"+p.name+"的年龄小");
			}
		}else
		{
			System.out.println("您输入的年龄不合法，请重新输入");
		}
	}
	public static void main(String[] args) {
		People p1 = new People(100, "刘备", 30);
		People p2 = new People(100, "张飞", 25);
		p2.compareAge(p1);
		p1.compareAge(p2);
		
		
	}

}
