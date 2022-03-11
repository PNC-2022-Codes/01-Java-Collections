package com.douglashdezt.col;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example02 {

	public static void main(String[] args) {
		Integer[] numbers1 = new Integer[] { 3, 4, 1, 2, 4, 3, 1, 2};
		
		Set<Integer> set1 = new HashSet<>();
		Collections.addAll(set1, numbers1);
		System.out.println(set1);
		
		System.out.println("---------------");
		
		set1.add(5);
		set1.add(10);
		set1.add(8);
		set1.add(8);
		set1.add(8);
		set1.add(8);
		set1.add(8);
		set1.add(8);
		
		System.out.println(set1);
		
	}

}
