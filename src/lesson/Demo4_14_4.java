package lesson;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo4_14_4 {

	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("hello");
		linkedHashSet.add("world");
		linkedHashSet.add("hellojack");
		linkedHashSet.add("nice to meet you ");
		linkedHashSet.add("nice to meet you too");

		System.out.println(linkedHashSet.size());
		System.out.println(linkedHashSet.contains("hello"));
		System.out.println("===================================");
		for (String s : linkedHashSet) {
			System.out.println(s);
		}

	}

}
