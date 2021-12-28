package com.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Basics {
	public static void main(String[] a) {
		//Collections Size can be grown Dynamically not possible in arrays
		ArrayList<Integer> al = new ArrayList<>(3);
		al.add(13);
		al.add(134);
		al.add(1368);
		al.add(21314);
		al.add(12344);
		System.out.println(al);
		//Collections allow hetrogenous elements
		//Collections --> predefined methods for searching and sorting
		//TreeSet to perform sorting
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Dkhil");
		ts.add("Chanu");
		ts.add("Bhandu");
		ts.add("Ahanu");
		System.out.println(ts);
		//Arrays allow only one type -->type safe operations
		//Collections : allows different type of elements; reduces typedness
		//Arrays : more performance less flexibilu=ity
		//Collections : more flexibility and less performance
		
	}

}
