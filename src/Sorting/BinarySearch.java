package Sorting;

public class BinarySearch {

	private int size;
	private int[] orderlist;
   public BinarySearch() {
	   size=0;
	   orderlist=new int[9];
   }
   public void insertOrder(int element) {
	  if(size==0) {
		  orderlist[size]=element;
		  size++;
	  }else {
		  if(orderlist[size-1]<=element) {
			  orderlist[size]=element;
			  size++;
		  }else {
			  int current=findPosition(element);
			   
			  for(int k=size;k>current;k--) {
				  orderlist[k]=orderlist[k-1];
			  }
			  orderlist[current]=element;
			  size++;
			  
		  }
	  }
	  
		   
}
   // to find position of element in ordered list;
   private int findPosition(int element) {
	   int position=0;
	   for(int i=0;i<size;i++) {
			  if(orderlist[i]>=element) {
				  position=i;
				  break;
			  }
		  }
	   return position;
   }
   public int[] getOrderList() {
	   return orderlist;
   }
   public int binarySearch(int[] list,int element) {
	   int first=0;
	   int last =list.length;
	   int mid=0;
	   int index=-1;
	   if(list[last-1]<element) {
		   index=-1;
	   }else {
		   
	   
	   while(first<=last) {
		mid=(first+last)/2;
		if(list[mid]<element) {
			first=mid+1;
		}else if(list[mid]==element) {
			index=mid+1;
			break;
		}else {
			last=mid-1;
		}
		
	    }
	   }
	     System.out.println("end of function");                                                                       
	return index;   
	   
   }
}
