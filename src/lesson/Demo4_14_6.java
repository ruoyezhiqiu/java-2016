package lesson;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo4_14_6 {

	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer,String> treeMap = new TreeMap<>();
		for(int i=1;i<=5;i++){
			hashMap.put(i, i);
			linkedHashMap.put(i, String.valueOf(i));
			treeMap.put(i, String.valueOf(i));
		}
		System.out.println(hashMap.size());
		System.out.println("-------------------------");
		for(Integer i:hashMap.keySet()){
			System.out.println(i+"--->"+hashMap.get(i));
		}
		System.out.println("-------------------------");
		for(Integer i:linkedHashMap.keySet()){
			System.out.println(i+"--->"+linkedHashMap.get(i));
		}
		System.out.println("-------------------------");
		for(Integer i:treeMap.keySet()){
			System.out.println(i+"==>"+treeMap.get(i));
		}
		

	}

}
