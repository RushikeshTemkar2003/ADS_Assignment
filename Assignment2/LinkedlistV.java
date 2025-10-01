/*Delete a node by its value in a LinkedList. */
import java.util.*;
class LinkedlistV {
 public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10); 
	list.add(20); 
	list.add(30); 
	list.add(40);

    System.out.println("LinkedList: " + list);
	list.remove(Integer.valueOf(30));

	System.out.println("LinkedList: " + list);
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac LinkedlistV.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java LinkedlistV
LinkedList: [10, 20, 30, 40]
LinkedList: [10, 20, 40]
*/
