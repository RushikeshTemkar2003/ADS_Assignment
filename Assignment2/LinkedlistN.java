/* Count the total number of nodes in a LinkedList. */
import java.util.*;
class LinkedlistN {
   public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10); 
	list.add(20); 
	list.add(30); 
	list.add(40);

	System.out.println("Total nodes: " + list.size());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac LinkedlistN.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java LinkedlistN
Total nodes: 4

*/
