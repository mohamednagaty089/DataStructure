import LinkedImplementation.LinkedStack;
import LinkedImplementation.Node;
import Queue.ArrayQueue;
import Queue.LinkedQueue;
import Queue.NodeQueue;

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
		//testing queue
		ArrayQueue queue=new ArrayQueue();
		//System.out.println(stack.push(0));
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		
		queue.enqueue(3333);
		
		queue.dequeue();
		queue.enqueue(23322);
		
		int arr[]=queue.getQueue();
		for (int i : arr) {
			System.out.println(i);
		} 
		//queue in linked implementation
		NodeQueue node=new NodeQueue();
		node.item=12;
		NodeQueue node1=new NodeQueue();
		node1.item=112;
		NodeQueue node2=new NodeQueue();
		node2.item=112;
		NodeQueue node3=new NodeQueue();
		node3.item=1221;
		LinkedQueue linkqueue=new LinkedQueue();
		linkqueue.enqueue(node);
		linkqueue.enqueue(node1);
		linkqueue.enqueue(node2);
		linkqueue.enqueue(node3);
        System.out.println(linkqueue.dequeue());
        System.out.println(linkqueue.dequeue());

	}

}
