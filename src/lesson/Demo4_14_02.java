package lesson;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo4_14_02 {

	public static void main(String[] args) {
//		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
/*		arrayList.add("hi");
		arrayList.add("Hello");
		//此处的set方法属于ArrayList类中的添加的方法：
		arrayList.set(0, "haha");
		//此处的get方法属于ArrayList类的获取类中指定角标位置元素值的方法：
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.size());*/
		
		for(int i =0;i<1000000;i++){
//			arrayList.add(String.valueOf(i));
			linkedList.add(String.valueOf(i));
		}
		long start =System.nanoTime();
//		System.out.println(arrayList.get(499999));
		System.out.println(linkedList.get(499999));
	
		
		System.out.println(System.nanoTime()-start);
		

	}

}
