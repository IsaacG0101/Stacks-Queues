import java.util.Stack;

public class StacksAndQueseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo1();
		//StackDemo2();
		//LinkedStackDemo1();

	}

	private static void LinkedStackDemo1() {
		// TODO Auto-generated method stub
		LinkedStack a = new LinkedStack();
		a.push("H");
		a.push("HI");
		a.push("B");
		a.push("H");
		
		System.out.println("LinkedStack: " + a.toString());
		System.out.println("Top item to pop" + a.pop());
		System.out.println("LinkedStack \n" + a);
		System.out.println("Next Item to pop:" + a.pop());
		System.out.println("Linked Stack:" + a);
		
		a.push("Touro");
		a.push("College");
		a.push("University");
		System.out.println("LinkedStack: \n" + a);
		System.out.println("Popping top which is: " + a.pop());
		System.out.println("");
		
	}

	private static void StackDemo2() {
		// TODO Auto-generated method stub
		Stack<Integer> a = new Stack<>();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		
		System.out.println("Stack before the Peak: " + a);
		System.out.println("Peeking at top element: " + a.peek());
		System.out.println("Stack after peek: " + a);
		System.out.println("Popping top item: " + a.pop());
		System.out.println("Stack After Pop" + a);
		System.out.println("Popping top item: " + a.pop());
		System.out.println("Stack After Pop" + a);
		
		
		/*
		 * BEcause when you pop an item a.Size() changes automatically so you only go through 50% of the stack
		 * when in reality you want to pop all of the stack so you put originalstackSize = a.Size(); that gives you the original stack amount
		 * and allows you to go through the whole thing
		 */
		for (int i = 0, startingStackSize = a.size(); i < startingStackSize; i++) {
			System.out.println(a.pop());
		}
		
	}

	private static void StackDemo1() {
		// TODO Auto-generated method stub
		Stack<String> a = new Stack<>();
		a.push("x ");
		a.push("y ");
		a.push("a ");
		a.push("c ");
		a.push("f ");
		a.push("r ");
		System.out.println(a);
		
		for(String current: a) {
			System.out.println(current);
		}
		
		for (int i = 0, size = a.size(); i <size; i++ ) {
		System.out.println(a.pop());
	}
	
	System.out.println("Remaining LIst: ");
	System.out.println(a);

}
}
