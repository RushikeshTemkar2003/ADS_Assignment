/* Search for an element in the array (linear search) */
import java.util.*;
class LinearSearch{
  static void search(int a[],int key){
	for(int i=0;i<a.length;i++)
	   if(a[i]==key){
		System.out.println("Element found at index "+i);
		return;
	}
	  System.out.println("Not found");
	}
  public static void main(String args[]){
	int arr[]={10,20,30,40,50};
	search(arr,30);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac LinearSearch.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java LinearSearch
Element found at index 2
*/
