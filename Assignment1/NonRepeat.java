/*. First Non-Repeated Character
Problem: Write a Java program to find the first non-repeated character in a string*/

import java.util.*;
public class NonRepeat{
	static Character firstchar(String s){
		Map<Character, Integer> freq =new LinkedHashMap<>();
		for(char c : s.toCharArray()){
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		for (char c: freq.keySet()){
			if (freq.get(c)==1){
				return c;
			}
		}
		return null;
	}
	public static void main(String[]args){
		System.out.println(firstchar("rushikesh"));
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac NonRepeat.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java NonRepeat
r
*/
