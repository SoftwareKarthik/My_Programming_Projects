package com.framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList name = new ArrayList<>();
		name.add("karthik");
		System.out.print(name);*/
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		list.add(1, 1);
		System.out.println(list);
		List<Integer>newlist=new ArrayList<>();
		newlist.add(150);
		newlist.add(160);
		list.addAll(newlist);
		System.out.println(list);
		System.out.println(list.get(6));
		list.remove(5);
		System.out.println(list);
		list.remove(Integer.valueOf(1000000));
		System.out.println(list);
		list.clear();
		System.out.println(list);
		list.set(4, 42);
		System.out.println(list);
		System.out.println(list.contains(40));
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
