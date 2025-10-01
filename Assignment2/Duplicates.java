/* Display duplicate elements from an array. */
import java.util.*;
class Duplicates{
 static void showDup(int a[]){
	boolean found=false;
	for(int i=0;i<a.length;i++){
	  for(int j=i+1;j<a.length;j++)
	    if(a[i]==a[j]){
		System.out.print(a[i]+" ");
		found=true;
		break;
	 }
	}
	if(!found) System.out.print("No duplicates");
}
public static void main(String args[]){
	int arr[]={1,2,3,4,2,5,1};
	showDup(arr);
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac Duplicates.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java Duplicates
1 2
*/
