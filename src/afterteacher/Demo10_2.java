package afterteacher;
//实现接口下的多态：
interface Dao{
	void add();
	void detele();
}
class UserDao implements Dao{
	public void add(){
		System.out.println("添加用户成功！");
	}
	public void detele(){
		System.out.println("删除用户成功");
	}
}
public class Demo10_2 {

	public static void main(String[] args) {
		//此处实现了接口的多态，即使用接口引用类型定义一个实现类的对象：
		Dao d = new UserDao();
		d.add();
		d.detele();
	}

}
