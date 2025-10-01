/*Write a Java program to add, update, remove, and display books using
HashMap. 
*/

import java.util.*;
public class Mapss{
	public static void main(String[]args){
		Map<Integer,String> list=new HashMap<>();
		
		list.put(1,"Alpha");
		list.put(2,"Beta");
		list.put(2,"Gamma");
		list.remove(1);
		
		System.out.println(list);
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Mapss.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Mapss
{2=Gamma}
*/
