package List;

public class LinkedList {
	private ListNode head;
	private int size;
	public LinkedList() {
		size=0;
		head=null;
	}
	public boolean isEmpty() {
		if(size==0)return true;
		else return false;
	}
	public int listItemNumber() {
		return size;
	}
	public void Add(ListNode node,int position) {
		if(position==0) {
			node.next=head;
			head=node;
			size++;
		}else if(position<=size) {
			ListNode pointer=head;
			for(int i=0;i<position-1;i++) {
				pointer=pointer.next;
			}
			node.next=pointer.next;
			pointer.next=node;
			size++;
		}
	}
	public void Add(ListNode node) {
		node.next=head;
		head=node;
		size++;
	}
	public void remove(int position) {
		if(position==0) {
			head=head.next;
			
		}else {
			ListNode temp=head;
			for(int i=0;i<position-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		size--;
	}
	public ListNode getList() {
		return head;
	}
	public int getListSize() {
		return size;
	}
	

}
