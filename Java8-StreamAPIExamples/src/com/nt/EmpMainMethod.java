package com.nt;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EmpMainMethod {

	public static void main(String[] args) {

		Map<Employee, Integer> map = new HashMap<Employee, Integer>();

		map.put(new Employee(1, "aju", "IT"), 10023);
		map.put(new Employee(4, "zajukumar", "govt"), 200);
		map.put(new Employee(8, "jmesh", "IT"), 100);
		map.put(new Employee(9, "ramesh", "police"), 500);
		map.put(new Employee(8, "mahesh", "infra"), 700);

		//map.entrySet().stream().forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee:: getName).reversed())).forEach(System.out::println);

	}

}
