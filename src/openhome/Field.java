package openhome;
//定义Clothes类：
class Clothes{
	String color;
	char size;
}
public class Field {

	public static void main(String[] args) {
		//建立Clothes实例（即:对象）：sun,spring。
		Clothes sun = new Clothes();
		Clothes spring = new Clothes();
		
		//为个别对象的数据成员指定值。
		sun.color = "red";
		sun.size = 'S';
		spring.color = "green";
		spring.size = 'M';
		
		System.out.printf("sun (%s,%c)%n",sun.color ,sun.size);
		System.out.printf("spring (%s,%c)%n",spring.color,spring.size);
		

	}

}
