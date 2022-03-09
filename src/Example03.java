import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example03 {

	public static void main(String[] args) {
		//Sets
	
		Integer[] numbers1 = new Integer[] {1, 2, 3, 4, 4, 3};
		Integer[] numbers2 = new Integer[] {22, 11, 10, 11, 4, 3};
		
		Set<Integer> set1 = new HashSet<>();
		Collections.addAll(set1, numbers1);
		System.out.println(set1);
		
		System.out.println("--------------------------");
		
		set1.add(4);
		set1.add(6);
		set1.add(8);
		set1.add(4);
		set1.add(10);
		
		System.out.println(set1);
		
		System.out.println("--------------------------");
		
		Set<Integer> set2 = new HashSet<>();
		Collections.addAll(set2, numbers2);
		System.out.println(set2);
		
		System.out.println("--------------------------");
		
		set1.addAll(set2);
		System.out.println(set1);
		
	}

}
