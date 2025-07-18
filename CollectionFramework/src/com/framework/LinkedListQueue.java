package com.framework;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>queue=new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		System.out.println("Queue:"+(queue));
		System.out.println(queue.poll());
		System.out.println("Queue:"+(queue));
		System.out.println(queue.peek());
		System.out.println("Queue:"+(queue));
		

	}

}
