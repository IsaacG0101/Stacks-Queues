import java.util.EmptyStackException;

public class Stack {
	
	private ListNode top;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int  data) {
			this.data = data;
		}
	}
	
	public Stack() {
		top = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void push(int value) {
		ListNode temp = new ListNode(value);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	  public String toString()
	    {
	       StringBuilder sBuilder = new StringBuilder();
	       
	       // Walk down the list and append all values
	       ListNode p = top;
	       while (p != null)
	       {
	           sBuilder.append(p.data + " ");
	           p = p.next;
	       }
	       return sBuilder.toString();        
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(15);
		s.pop();
		s.push(20);
		System.out.println(s.toString());

	}

}
