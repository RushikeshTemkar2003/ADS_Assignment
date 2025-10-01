/*Search for an element in a LinkedList. */
import java.util.*;
class LinkedlistS {
  public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10); 
	list.add(20); 
	list.add(30); 
	list.add(40);

	int index = list.indexOf(30);
	if(index != -1)
		System.out.println("Element found at index " + index);
	else
		System.out.println("Element not found");
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac LinkedlistS.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java LinkedlistS
Element found at index 2
*/
