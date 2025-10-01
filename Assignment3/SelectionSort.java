/* Selection Sort
Sort an array using Selection Sort. */


import java.util.*;
class SelectionSort {
 public static void main(String[] args) {
	int[] arr = {64, 25, 12, 22, 11};
	for (int i = 0; i < arr.length - 1; i++) {
	  int min = i;
    	for (int j = i + 1; j < arr.length; j++)
	      if (arr[j] < arr[min]) min = j;
		int t = arr[min];
		arr[min] = arr[i];
		arr[i] = t;
	}
	System.out.println(Arrays.toString(arr));
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac SelectionSort.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java SelectionSort
[11, 12, 22, 25, 64]
*/
