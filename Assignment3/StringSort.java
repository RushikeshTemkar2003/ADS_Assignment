/* Sorting Strings (Lexicographic Order)
Write a program to sort an array of strings using any sorting algorithm. 
*/
import java.util.*;
class StringSort {
 public static void main(String[] args) {
	String[] arr = {"dog", "cat", "elephant", "bee"};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac StringSort.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java StringSort
[bee, cat, dog, elephant]
*/
