package com.douglashdezt.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Example01 {
	
	public static void main(String[] args) {
		List<Integer> numbers = new Stack<>();
		
		numbers.add(8);
		numbers.add(11);
		numbers.add(34);
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		
		//numbers.push(4);
		
		for(int i = 0; i < numbers.size(); i++) {
			int value = numbers.get(i);
			
			System.out.println("Item " + i + ": " + value);
		}
		
		System.out.println("---------------");
		//numbers.pop();
		
		Iterator<Integer> numbersIterator = numbers.iterator();
		while(numbersIterator.hasNext()) {
			int value = numbersIterator.next();
			System.out.println("Item: " + value);
		}
		
		System.out.println("---------------");
		
		int index1 = numbers.indexOf(8);
		System.out.println("Index1: " + index1);
		
		int index2 = numbers.lastIndexOf(8);
		System.out.println("Index2: " + index2);
		
		int index3 = numbers.indexOf(500);
		System.out.println("Index3: " + index3);
	}

}
