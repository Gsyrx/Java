package prg12;
import java.util.Iterator;
import java.util.LinkedList;
public class LListString {
	private LinkedList<String> nameList = new LinkedList<>();
    public void addName(String name){
        nameList.add(name);
    }
    public void disp5(){
        if(nameList.isEmpty())
            System.out.println("List is Empty");
        else {
            Iterator iterator = nameList.iterator();
            while(iterator.hasNext()){
                String name = iterator.next().toString();
                if (name.length() < 5)
                    System.out.println(name);
            }
        }
    }
}





package prg12;
public class LListStringDemo {
	public static void main(String[] args) {
        LListString myList = new LListString();
        System.out.println("The list which have length less than 5 are as : ");
        myList.addName("Akash");
        myList.addName("Bhaskar");
        myList.addName("Chet");
        myList.addName("Dan");
        myList.addName("George");
        myList.addName("Han");
        myList.disp5();
	}
}
