package Queue;

public class ArrayQueue {
private int rear=-1;
private int front=-1;
private int size=0;
private int arr[];
public ArrayQueue(int size) {
	arr=new int[size];
}
public ArrayQueue() {
	arr=new int[7];
}
// add new element in queue
public void enqueue(int element) {
	if(!isFull()) {
		
		rear=incrementIndex(rear) ;
		size++;
		arr[rear]=element;
	}
}
//served element from queue
public String dequeue() {
	if(!isEmpty()) {
		front=incrementIndex(front);
		size--;
		return ""+arr[front];
	}
	return "stack is empty";
}

private int incrementIndex(int item) {
	if(item==arr.length-1) {
		item=0;
		
	}else {
		
		item++;
		
	}
	return item;
}
public boolean isFull() {
	if(size==arr.length) {
		return true;
	}
	else 
		return false;
}
public boolean isEmpty() {
	if(size==0) {
		return true;
	}else
		return false;
}
public int [] getQueue() {
	return arr;
}



}
