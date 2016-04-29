package lesson;
//泛型的练习：泛型类练习(注接口泛型跟类泛型相似)
class GenericTest<T extends Number>{
	public void changeValue(T a,T b){
		System.out.println("交换前的值分别是："+a+","+b);
		T temp;
		temp =a;
		a = b;
		b = temp;
		System.out.println("交换后的值分别是："+a+","+b);
	};
}
public class Demo4_14_7 {

	public static void main(String[] args) {
		GenericTest<Integer> generic = new GenericTest<>();
		GenericTest<Double> generic01 = new GenericTest<>();
		generic.changeValue(10, 20);
		generic01.changeValue(1.3, 2.2);
	}

}
