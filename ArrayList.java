package prg12;
	import java.util.ArrayList;
	import java.util.Iterator;
	public class ListQueue {
	    private ArrayList<String> qList;
	    private int capacity;
	    ListQueue(int capacity){
	        qList = new ArrayList<>(capacity);
	        this.capacity = capacity;
	    }
	    public void insertEnd(String item) {
	        int size = qList.size();
	        if(size == capacity){
	            System.out.println("Queue if full");
	        } else {
	            qList.add(size,item);
	        }
	    }
	    public String deleteFront(){
	        int size = qList.size();
	        if (size == 0){
	            throw new NullPointerException("Queue is Empty!!!!");
	        } else {
	            return qList.remove(0);
	        }
	    }
	    public void displayContents(){
	        int size = qList.size();
	        if (size == 0) {
	            System.out.println("Queue is Empty");
	        } else {
	            Iterator<String> iterator = qList.iterator();
	            while (iterator.hasNext())
	                System.out.print(iterator.next()+" ");
	        }
	    }
	}
  
  
  
  
  
  
  
  package prg12;
public class ListQueueDemo {
	public static void main(String[] args) {
        ListQueue myQueue = new ListQueue(5);
        for(int i = 0;i<15;i+=2)
            myQueue.insertEnd(i+" ");
        myQueue.displayContents();
        for(int i = 0;i < 6; i++)
            System.out.println("Deleted item is " + myQueue.deleteFront());
        myQueue.displayContents();
    }
}
