import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		//Lists
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		//With for statement
		for (int i = 0; i < numbers.size(); i++) {
			int value = numbers.get(i);
			System.out.println("Item " + i + ": " + value);
		}
		
		//Using iterators
		Iterator<Integer> numbersIterator = numbers.iterator();
		
		System.out.println("-------------------------------");
		
		while(numbersIterator.hasNext()) {
			int value = numbersIterator.next();
			System.out.println("Item: " + value);
		}
		
		System.out.println("-------------------------------");
		
		//Search in list
		int index = numbers.lastIndexOf(3);	
		System.out.println("Item " + index);
		
		index = numbers.lastIndexOf(10);
		System.out.println("Item " + index);
	}

}
