
public class Stack {
private int top=-1;
private int size=0;
private int arr[];

public Stack() {
	arr=new int[5];
}
public Stack(int size) {
	arr=new int[size];
}
public String push(int item) {
	if(!isFull()) {
		arr[++top]=item;
		return "inserted item : "+item;
	}
	return "Stack is Full";
}
public boolean isFull() {
	if(top==arr.length) {
		return true;
	}
	return false;
}
public boolean isEmpty() {
	if(top==0) {
		return true;
	}
	return false;
}
public int pop() {
     return arr[top--];	
}

}
