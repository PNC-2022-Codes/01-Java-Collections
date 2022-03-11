package com.douglashdezt.col;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Example04 {

	public static void main(String[] args) {
		//Map<Character, String> map = new HashMap<>();
		TreeMap<Character, String> map = new TreeMap<>();
		
		map.put('b', "A-Value");
		map.put('v', "H-Value");
		map.put('g', "B-Value");
		map.put('h', "Q-Value");
		map.put('u', "J-Value");
		map.put('y', "Y-Value");
		
		System.out.println(map);
		
		System.out.println(map.get('h'));
		
		map.remove('y');
		
		System.out.println(map);
		
		System.out.println("---------");
		
		Iterator<Character> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			char key = iterator.next();
			
			System.out.println(map.get(key));
		}
		
		
	}

}
