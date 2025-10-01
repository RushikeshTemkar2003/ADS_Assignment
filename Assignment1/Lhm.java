/*Write a Java program to add, update, remove, and display books using
HashMap.  */

import java.util.*;
public class Lhm{
	public static void main(String[]args){
		Map<String,String> list=new LinkedHashMap<>();
		list.put("alice","a1");
		list.put("bob","b1");
		list.put("carol","c1");
		list.remove("bob");
		list.put("bob","b2");
		
		System.out.println(list);
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Lhm.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Lhm
{alice=a1, carol=c1, bob=b2}
*/
