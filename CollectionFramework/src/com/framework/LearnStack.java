package com.framework;
import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>animals=new Stack<>();
		animals.push("Lion");
		animals.push("cheetah");
		animals.push("tiger");
		animals.push("dog");
        System.out.println("Stack :"+(animals));
        System.out.println("Peek :"+(animals.peek()));
        animals.pop();
        System.out.println("Peek :"+(animals.peek()));
        System.out.println("Stack :"+(animals));
	}

}
