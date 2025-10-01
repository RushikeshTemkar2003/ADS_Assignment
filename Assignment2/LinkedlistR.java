/* Reverse a LinkedList. */
import java.util.*;
class LinkedlistR {
 public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10); 
	list.add(20); 
	list.add(30); 
	list.add(40);

	System.out.print("LinkedList: ");
	for(int i=list.size()-1; i>=0; i--) {
	  System.out.print(list.get(i));
	  if(i>0) System.out.print(" : ");
	}
	if(list.isEmpty()) System.out.print("(empty)");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac LinkedlistR.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java LinkedlistR
LinkedList: 40 : 30 : 20 : 10
*/
