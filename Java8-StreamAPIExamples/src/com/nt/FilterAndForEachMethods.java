package com.nt;

import java.util.ArrayList;
import java.util.List;

public class FilterAndForEachMethods {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Koraboina Raju");
		list.add("saha");
		list.add("Bhnau");
		list.add("ravi");
		list.add("Ragava");

		// Traditinal approch
		for (String s : list) {
			//System.out.println(s);
		}

		
		// steam api
		list.stream().forEach(l -> System.out.println(l));
		
		// using method reference
		list.stream().forEach(System.out::println);

	}

}
