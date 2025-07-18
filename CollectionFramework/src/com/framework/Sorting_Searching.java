package com.framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<=10;i++)
			list.add(i);
		System.out.println("Required List :"+ (list));
		list.add(1,11);
		System.out.println("Updated List :"+ (list));
		List<Integer>newlist=new ArrayList<>();
		newlist.add(150);
		newlist.add(160);
		newlist.add(140);
		list.addAll(newlist);
		System.out.println("New List :"+ (list));
		//Sorting
		Collections.sort(list);
		System.out.println("Sorted List :"+ (list));
		//Searching
		System.out.println(list.contains(140));
		//BinarySearch
		int index = Collections.binarySearch(list,2);
		System.out.println(index);
		//Shuffling
		Collections.shuffle(list);
		System.out.println(list);
		//MaxMin
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		//Swapping
		Collections.swap(list, 0, 1);
		System.out.println("After swapping: " + list);
		//Reversing
		Collections.reverse(list);
		System.out.println("Reversed List :"+ (list));


	}

}
