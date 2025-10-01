/*Write a Java program to add, search, remove, and display elements using
HashSet. 

 
*/

import java.util.*;
public class Treee{
	public static void main(String[]args){
		Set<Character> list=new HashSet<>();
		
		list.add('A');
		list.add('A');
		list.add('B');
		
		System.out.println(list.contains('A'));
		System.out.println(list.contains('C'));
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Treee.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Treee
true
false

*/
