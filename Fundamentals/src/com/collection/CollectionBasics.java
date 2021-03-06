package com.collection;

import java.util.HashSet;

public class CollectionBasics {
	public static void main(String[] a) {
		//boolean add(Object obj) : return true or false
		HashSet hs = new HashSet();
		hs.add("A");
		hs.add("B");
		System.out.println(hs);
		System.out.println(hs.add("A"));
		System.out.println(hs);
		System.out.println("Add All");
		//addAll()-- boolean true or false
		HashSet hs1 = new HashSet();
		System.out.println(hs1.addAll(hs));
		System.out.println(hs1);
		System.out.println(hs1.addAll(hs));
		
		//remove()--> boolean
		System.out.println("Remove");
		System.out.println(hs.remove("A"));
		System.out.println(hs);
		
		//removeAll()-->boolean
		System.out.println("Remove All");
		System.out.println(hs1.removeAll(hs));
		System.out.println(hs1);
		
		
		//contains(obj)-->boolean
		System.out.println("Contains");
		System.out.println(hs1.contains("C"));
		System.out.println(hs1.contains("A"));
		
		//containsAll(Collection)-->boolean all must be present for true
		System.out.println(hs1.containsAll(hs));
		
		//retainAll(Collection) --> retains all elements present in collection and removes remaining
		System.out.println("Retains All");
		System.out.println(hs.retainAll(hs1));
		System.out.println(hs);
		
		//size() --> int
		//clear() --> remove all elements
		//isEmpty() --> 
		//public Object[] toArrray()
		
	}

}
