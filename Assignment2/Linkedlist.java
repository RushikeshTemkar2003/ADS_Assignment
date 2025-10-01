/*Create a LinkedList and insert elements at the end*/
import java.util.*;
class Linkedlist{
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(5);
	list.add(10);
	list.add(15);
	list.add(20);   

	System.out.println("LinkedList: " + list);
	list.add(25);
	System.out.println("LinkedList: " + list);
}
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac Linkedlist.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java Linkedlist
LinkedList: [5, 10, 15, 20]
LinkedList: [5, 10, 15, 20, 25]
*/

