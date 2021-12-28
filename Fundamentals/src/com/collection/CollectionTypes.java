package com.collection;

public class CollectionTypes {
	
	//Collection(3): List ,Set,Queue
	//List(3) : ArrayList,Vector and LinkedList
	//Vector(1) : Stack
	
	//Set(2) : HashSet,SortedSet
	            //HashSet(1): LinkedHashSet
	//SortedSet-->NavigableSet--> TreeSet
	
	//Queue -> priorityQueue,BlockingQueue
	//BlockingQueue(2)-->PriorityBlockingQueue,LinkedBlockingQueue
	
	//------------------------------------
	//Collection Vs Map
	//Map --> key,value pairs
	//Collection --> Only values
	
	//List --> index based
	//allows duplicate values
	//allows any no.of null values
	//follows insertion order
	//by default dont follows sorting order but:
    //SortedSet,NavigableSet and TreeSet follows Sorting order	
	
	//Set--> not index based it is based on hash code values
	//does not allow duplicate values
	//allows only one null value
	//does not follow any insertion order but LinkedHashSet follows insertion order
	
	//list and set by default allows hetrogenous elemets.
	 //SortedSet,NavigableSet and TreeSet only allows homogneous elements

}
