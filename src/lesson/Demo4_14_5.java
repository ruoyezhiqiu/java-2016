package lesson;

import java.util.Set;
import java.util.TreeSet;

//此例中的treeSet类实现了Set接口：其中使用for循环遍历之后是一个有顺序的输出：
public class Demo4_14_5 {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(-100);
		treeSet.add(-18);
		treeSet.add(10);
		treeSet.add(20);
		System.out.println(treeSet.size());
		System.out.println(treeSet.contains(23));
		System.out.println(treeSet.contains(20));
		System.out.println("===================");
		for (Integer i : treeSet) {
			System.out.println(i);
		}
	}

}
