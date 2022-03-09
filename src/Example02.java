import java.util.Stack;

public class Example02 {

	public static void main(String[] args) {
		//Stacks
		
		Stack<Integer> mainStack = new Stack<Integer>();
		
		mainStack.push(2);
		mainStack.push(10);
		mainStack.push(15);
		mainStack.push(16);
		mainStack.push(3);
		mainStack.push(33);
		mainStack.push(4);
		
		System.out.println(mainStack);
		System.out.println("-------------------------");
		
		int popedValue = mainStack.pop();
		System.out.println("Poped Value: " + popedValue);
		
		popedValue = mainStack.pop();
		System.out.println("Poped Value: " + popedValue);
		
		popedValue = mainStack.pop();
		System.out.println("Poped Value: " + popedValue);
		
		popedValue = mainStack.pop();
		System.out.println("Poped Value: " + popedValue);
		
		System.out.println("-------------------------");
		
		System.out.println(mainStack);
	}

}
