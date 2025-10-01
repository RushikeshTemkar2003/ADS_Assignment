/*Write a Java program to add, update, remove, and display elements using
LinkedList. 
*/

import java.util.*;
public class Curd{
	public static void main(String[]args){
		List<Character> list=new LinkedList<>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		//list.remove(0);
		list.set(1, 'X');
		
		System.out.println(list);
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Curd.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Curd
[A, X, C]
*/
