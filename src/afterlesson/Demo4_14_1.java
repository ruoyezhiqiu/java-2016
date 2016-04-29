package afterlesson;

import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;

//List练习：ArrayList的 练习：
//注意：List中的元素是可以重复的，而Set中的元素是不能重复的。
public class Demo4_14_1 {

	public static void main(String[] args) {
//		定义一个泛型接口类型的List引用变量类型的变量 arrayList指向一个ArrayList类型的对象：
		ArrayList<String> arrayList = new ArrayList<>();
		
//		add(E 0)：将制定元素添加到此列表的结尾:
		arrayList.add("end");
		arrayList.add("hello");
		arrayList.add("world");
		
//		add(int index,E element):在此列表指定的位置插入指定的元素：
		arrayList.add(1, "second");
		
//		clear()：移除该列表中所有的元素：
		arrayList.clear();
		
//		clone()：返回一个此ArrayList实例的浅表副本：
//		ArrayList arrayList01 = (ArrayList)(arrayList.clone());
		
//		contains(Object o)：如果此列表中包含指定的元素，则返回 true。
		arrayList.contains("hello");
		
//		ensureCapacity(int minCapacity)：如有必要，增加此 ArrayList 实例的容量，以确保它至少能够容纳最小容量参数所指定的元素数。
		arrayList.ensureCapacity(1000000);
		
//		get(int index):返回此列表中指定位置上的元素。
		//arrayList.get(0);
		
//		indexOf(Object o):返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
		arrayList.indexOf("world");
//		

	}

}
