/* Delete the first node of a LinkedList */
import java.util.*;
class LinkedlistF {
 public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10); 
	list.add(20); 
	list.add(30); 
	list.add(40);

	System.out.println("LinkedList: " + list);
	
	list.removeFirst();

	System.out.println("LinkedList: " + list);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac LinkedlistF.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java LinkedlistF
LinkedList: [10, 20, 30, 40]
LinkedList: [20, 30, 40]

*/
