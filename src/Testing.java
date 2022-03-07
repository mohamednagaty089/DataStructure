import LinkedImplementation.LinkedStack;
import LinkedImplementation.Node;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack(4);
		System.out.println(stack.push(3));
		System.out.println(stack.push(2));
		System.out.println(stack.push(5));
		System.out.println(stack.push(2));
		// pop function
		System.out.println(stack.pop());
		System.out.println(stack.push(2232));
		LinkedStack linked=new LinkedStack();
		linked.push(3);
		linked.push(33);
		linked.push(34);
		linked.push(35);
		linked.push(8);
		///
//		System.out.println(linked.pop());
//		System.out.println(linked.pop());
//		System.out.println(linked.pop());
//		System.out.println(linked.pop());
//		System.out.println(linked.pop());
		Node linkedstack=linked.getStack();
		while(linkedstack!=null) {
			System.out.println(linkedstack.element);
			linkedstack=linkedstack.next;
		}
		//System.out.println(stack.push(0));

	}

}
