import java.util.SortedSet;
import java.util.TreeSet;

public class Example04 {

	public static void main(String[] args) {
		//TreeSets
		
		SortedSet<String> orderedSet = new TreeSet<>();
		
		orderedSet.add("Z-Element");
		orderedSet.add("A-Element");
		orderedSet.add("H-Element");
		orderedSet.add("R-Element");
		orderedSet.add("B-Element");
		
		System.out.println(orderedSet);
	}

}
