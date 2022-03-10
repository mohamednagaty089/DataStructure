package List;

public class DoublyLinkedList {
public DoublyListNode top;
public DoublyListNode bottom;
private int size;
public DoublyLinkedList() {
	top=null;
	bottom=null;
	size=0;
}
public void insert(DoublyListNode node) {
	if(size==0) {
		node.next=top;
		node.back=bottom;
		top=node;
		bottom=node;
		size++;
	}else {
		top.back=node;
		node.next=top;	
		top=node;
		size++;
	}
	
}
public int getListSize() {
	return size;
}
public DoublyListNode getListFrombottom() {
	return bottom;
	
}
public DoublyListNode getListFromTop() {
	return top;
}

}
