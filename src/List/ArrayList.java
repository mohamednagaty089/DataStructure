package List;

public class ArrayList {
	private int list[];
	private int listcount=0;
	public ArrayList(int size) {
		list=new int[size];
	}
	public void add(int item,int index) {
		if(!isFull()&&index<=listcount) {
          	 if(index==listcount) {
          		list[index]=item;
          		listcount++;
          	}
          	 else
          	 {
          		for(int i=listcount-1;i>=index;i--) {
          			list[i+1]=list[i];
          		}
          		list[index]=item;
          		listcount++;
          	}
		}
		
	}
	public int remove(int index) {
		
		if(index<listcount) {
			for(int i=index;i<=listcount-1;i++) {
				list[i]=list[i];
			}
			listcount--;
			return list[index];
		}
		return 0;//index out of pounds
	}
	public void add(int item) {
		if(!isFull()) {
			list[listcount++]=item;
			
		}
	}
	public void printlist() {
		for(int i=0;i<listcount;i++) {
			System.out.println(list[i]);
		}
	}
	public int getListItem(int index) {
		if(index<list.length-1) {
			return list[index];
		}
		return -1;
	}
	public boolean isEmpty() {
		if(listcount==0) {
			return true;
		}else
			return true;
	}
	public boolean isFull() {
		if(listcount==list.length) {
			return true;
		}else
			return false;
	}

}
