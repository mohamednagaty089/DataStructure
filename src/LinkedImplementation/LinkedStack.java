package LinkedImplementation;

public class LinkedStack {
	private Node top;
	public LinkedStack() {
		top=null;
	}
	public void push(int element) {
		
		if(top==null) {
			top=new Node();
			top.element=element;
		}else {
			Node temp=new Node();
			temp.element=element;
			temp.next=top;
			top=temp;
		}
	}
	public Node getStack() {
		return top;
	}
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		else
			return false;
	}
	public int pop() {
	   int item=top.element;
	   top=top.next;
	   return item;
	}

}
