package com.nt;

import java.util.HashMap;
import java.util.Map;

public class usingMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Koraboina Raju", 1);
		map.put("saha", 3);
		map.put("Bhnau", 4);
		map.put("ravi", 7);
		map.put("Ragava", 6);

		// map.forEach((k, v) -> System.out.println(k + "" + v));

		// map.entrySet().stream().forEach(System.out::println);

		// map.entrySet().stream().filter(k -> k.getValue() % 2 == 0).forEach(v ->
		// System.out.println(v));
		map.entrySet().stream().filter(k -> k.getValue() % 2 == 0).forEach(System.out::println);

		map.entrySet().stream().filter(key -> key.getKey() == "ravi").forEach(System.out::println);

	}

}
