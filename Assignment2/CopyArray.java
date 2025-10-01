/* Copy elements of one array into another. */
import java.util.*;
class CopyArray{
  public static void main(String args[]){
	int s[]={1,2,3,4,5};
	int d[]=new int[s.length];
	for(int i=0;i<s.length;i++)
		d[i]=s[i];
	System.out.println("Destination : "+Arrays.toString(d));
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac CopyArray.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java CopyArray
Destination : [1, 2, 3, 4, 5]

*/
