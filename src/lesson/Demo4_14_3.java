package lesson;

import java.util.HashSet;
import java.util.Set;

public class Demo4_14_3 {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("hi");
		hashSet.add("hi");
		hashSet.add("World");
		hashSet.add("Hi");
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains("Hi"));
		System.out.println(hashSet.remove("hi"));
		System.out.println(hashSet.size());
	}

}
