/*
Insertion Sort
Implement Insertion Sort to arrange elements in ascending order. 
*/
import java.util.*;
class InsertionSort {
public static void main(String[] args) {
	int[] arr = {12, 11, 13, 5, 6};
	for (int i = 1; i < arr.length; i++) {
	  int key = arr[i];
   	  int j = i - 1;
      while (j >= 0 && arr[j] > key) {
		arr[j + 1] = arr[j];
		j--;
	}
		arr[j + 1] = key;
	}
	System.out.println(Arrays.toString(arr));
}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac InsertionSort.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java InsertionSort
[5, 6, 11, 12, 13]
*/
