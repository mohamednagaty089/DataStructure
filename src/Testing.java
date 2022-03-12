import List.LinkedList;

import Stack.Stack;

import List.ArrayList;
import List.DoublyLinkedList;
import List.DoublyListNode;
import Queue.ArrayQueue;
import Queue.LinkedQueue;
import Queue.NodeQueue;
import Sorting.BinarySearch;
import Stack.LinkedStack;
import Stack.Node;
import List.ListNode;
public class Testing {
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
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
		
		String name1=new String("emad");
		String name2=new String("emad");
		System.out.println(name1.equals(name2));
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
        ArrayList list=new ArrayList(5);
        list.add(23);
        list.add(34);
        list.add(22);
        list.add(444,0);
        list.remove(0);
      
        System.out.println("start printint list");
        list.printlist();
        //linkedlist 
        ListNode<String> lnode1=new ListNode<String>();
        lnode1.item="mohamed";
        ListNode<Double> lnode2=new ListNode<>();
        lnode2.item=23.3;
        ListNode<Integer> lnode3=new ListNode<>();
        lnode3.item=34;
        ListNode<String> lnode4=new ListNode<>();
        lnode4.item="Nagaty";
        ListNode<String> lnode5=new ListNode<>();
        lnode5.item="Badawy";
        LinkedList list3=new LinkedList();
        list3.Add(lnode4);
        list3.Add(lnode3);
        list3.Add(lnode2);
        list3.Add(lnode1);
        list3.Add(lnode4);
        list3.Add(lnode5, 0);
        list3.remove(0);
        list3.remove(1);
        ListNode ls=list3.getList();
        int count=0;
        int listsize=list3.getListSize();
        System.out.println("printing element linked list");
        while(count<listsize) {
        	System.out.println(ls.item);
        	ls=ls.next;
        	count++;
        }
        //doubly list adding from top retrive from top and bottom 
        DoublyLinkedList doublylist=new DoublyLinkedList();
        DoublyListNode dl1=new DoublyListNode();
        dl1.item="mohamed";
        DoublyListNode dl2=new DoublyListNode();
         dl2.item="mostafa";
         DoublyListNode dl3=new DoublyListNode();
         dl3.item="badawy";
         DoublyListNode dl4=new DoublyListNode();
         dl4.item="islam";
         doublylist.insert(dl1);
         doublylist.insert(dl2);
         doublylist.insert(dl3);
         doublylist.insert(dl4);
         int count1=doublylist.getListSize();
         DoublyListNode dlist= doublylist.getListFrombottom();
         //looping from bottom of list
     	while(count1>0){
     	   	 System.out.println(dlist.item);
     	   	 dlist=dlist.back;
     	   	 count1--;
     	    }
     	BinarySearch binary=new BinarySearch();
     	binary.insertOrder(5);
     	binary.insertOrder(12);
     	binary.insertOrder(1);
     	binary.insertOrder(3);
     	binary.insertOrder(2);
     	binary.insertOrder(7);
      	binary.insertOrder(38);
     	binary.insertOrder(20);
     	binary.insertOrder(7);
        int arr22[]=binary.getOrderList();
        for(int item : arr22) {
        	System.out.println(item);
        }
        System.out.println("Searching on element ");
        int check=binary.binarySearch(arr22,350);
     
         System.out.println(check);
         
         


	}

}
