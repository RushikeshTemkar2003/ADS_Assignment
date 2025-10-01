/*  Quick Sort
Implement Quick Sort using the last element as the pivot. 
*/
import java.util.*;
class QuickSort {
static int partition(int[] a,int low,int high){
	int pivot=a[high],i=low-1;
	for(int j=low;j<high;j++){
	  if(a[j]<=pivot){
		i++;
     	int t=a[i];a[i]=a[j];a[j]=t;
		}
	}
	int t=a[i+1];a[i+1]=a[high];a[high]=t;
	return i+1;
}
static void sort(int[] a,int low,int high){
	if(low<high){
	 int pi=partition(a,low,high);
	 sort(a,low,pi-1);
	 sort(a,pi+1,high);
	}
}
public static void main(String[] args){
	int[] arr={10,7,8,9,1,5};
	sort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac QuickSort.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java QuickSort
[1, 5, 7, 8, 9, 10]
*/
