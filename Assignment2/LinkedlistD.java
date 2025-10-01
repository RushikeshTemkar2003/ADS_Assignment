/*Delete the last node of a LinkedList. */
import java.util.*;
class LinkedlistD {
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10); 
	list.add(20); 
	list.add(30); 
	list.add(40);

	System.out.println("LinkedList: " + list);

	list.removeLast();

	System.out.println("LinkedList: " + list);
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac LinkedlistD.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java LinkedlistD
LinkedList: [10, 20, 30, 40]
LinkedList: [10, 20, 30]

*/
