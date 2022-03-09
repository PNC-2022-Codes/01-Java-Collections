import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Example05 {

	public static void main(String[] args) {
		Map<Character, String> map = new TreeMap<>();
		//Map<Character, String> map = new HashMap<>();
		
		map.put('a', "Valor 1");
		map.put('b', "Valor 20");
		map.put('x', "Valor 76");
		map.put('c', "Valor 33");
		map.put('h', "Valor 5");
		
		System.out.println(map);
		
		System.out.println("----------------------------");
		
		Iterator<Character> mapIterator = map.keySet().iterator();
		while(mapIterator.hasNext()) {
			char key = mapIterator.next();
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
		
		System.out.println("----------------------------");
		
		map.remove('b');
		map.remove('h');
		
		System.out.println(map);
	}

}
