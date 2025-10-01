/*Write a Java program to insert, delete, and display employee names in sorted
order using TreeSet. 
*/

import java.util.*;
public class Sorting{
	public static void main(String[]args){
		Set<String> list=new TreeSet<>();
		
		list.add("Meera");
		list.add("meera");
		list.add("Arjun");
		list.add("Arjun");
		
		
		System.out.println(list);
		
		list.remove("Meera");
		
		System.out.println(list);
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Sorting.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Sorting
[Arjun, Meera, meera]
[Arjun, meera]

*/
