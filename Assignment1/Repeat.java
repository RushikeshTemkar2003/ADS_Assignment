/*Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string. */

import java.util.*;
public class Repeat{
	static void duplicate(String s){
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for (int i=0; i<arr.length;){
			int count =1;
			while (i+count < arr.length && arr[i] == arr[i + count]){
				count++;
			}
			if (count >1){
				System.out.println(arr[i]+" ");
			}
			i += count;
		}
	}
	public static void main(String[]args){
		String s = "rushikesh";
		duplicate(s);
	}
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Repeat.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Repeat
h
s

*/
