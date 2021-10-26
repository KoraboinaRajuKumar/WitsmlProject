package com.nt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Filtermethod {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Koraboina Raju");
		list.add("saha");
		list.add("Bhnau");
		list.add("ravi");
		list.add("Ragava");
/*
		for (String s : list) {

			if (s.startsWith("K")) {
				//System.out.println(s);
			}*/

			list.stream().filter(f -> f.startsWith("B")).forEach(l -> System.out.println(l));
			list.stream().filter(f -> f.startsWith("r")).collect(Collectors.toList()).forEach(System.out::println);


		}

	
}
