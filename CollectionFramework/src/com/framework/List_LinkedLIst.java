package com.framework;
import java.util.*;

public class List_LinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<Integer>list=new LinkedList<>();
				list.add(10);
				list.add(20);
				list.add(30);
				list.add(40);
				list.add(50);
				list.add(60);
				System.out.println("List:"+(list));
				list.add(1, 1);
				System.out.println(list);
				List<Integer>newlist=new LinkedList<>();
				newlist.add(150);
				newlist.add(160);
				list.addAll(newlist);
				System.out.println("NewList:"+(list));
				System.out.println("Get Index Value:"+(list.get(6)));
				list.remove(5);
				System.out.println("New List:"+(list));
				list.remove(Integer.valueOf(30));
				System.out.println("New List:"+(list));
				list.set(4, 42);
				System.out.println("New List:"+(list));
				System.out.println("Contains Value :" + (list.contains(40)));
				Iterator<Integer> it = list.iterator();
				while(it.hasNext()) {
					System.out.println("Iterated Values :"+(it.next()));
				}

			}
	}

