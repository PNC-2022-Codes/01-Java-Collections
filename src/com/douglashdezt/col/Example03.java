package com.douglashdezt.col;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example03 {
		
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Set<String> set = new HashSet<>();
		
		set.add("Z-El");
		set.add("F-El");
		set.add("B-El");
		set.add("T-El");
		set.add("H-El");
		set.add("A-El");
		
		System.out.println(set);
	}

}
