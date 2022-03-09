package Queue;

public class LinkedQueue {
 private int size;
 private NodeQueue rear;
 private NodeQueue front;
 public LinkedQueue() {
	 rear=null;
	 front=null;
 }
 public void enqueue(NodeQueue node) {
	 if(rear==null) {
		 rear=node;
		 front=node;
		 size++;
	 }else {
		 rear.next=node;
		 rear=node;
		 size++;
	 }
 }
 public int queueSize() {
	 return size;
 }
 public int dequeue() {
	 int queueitem=0;
	 if(!isEmpty()) {
		 size--;
		 queueitem=front.item;
		 front=front.next;
     }
	 return queueitem;
 }
 public boolean isEmpty() {
	 if(size==0) {
		 return true;
	 }else {
		 return false;
	 }
 }
}
