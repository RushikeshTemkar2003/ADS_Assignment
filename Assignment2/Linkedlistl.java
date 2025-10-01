/* Insert a new node at the beginning of a LinkedList*/

import java.util.*;
class Linkedlistl {
  public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	
	System.out.println("LinkedList: " + list);

	list.addFirst(5);  

	System.out.println("LinkedList: " + list);
}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac Linkedlistl.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java Linkedlistl
LinkedList: [10, 20, 30]
LinkedList: [5, 10, 20, 30]
*/

