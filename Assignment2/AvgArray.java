/*Find the average of array elements */
import java.util.*;
class AvgArray{
 static double avg(int a[]){
	double s=0;
	for(int x:a) s+=x;
	return s/a.length;
    }
  public static void main(String args[]){
	int arr[]={10,20,30,40,50};
	System.out.println("Average : "+avg(arr));
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac AvgArray.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java AvgArray
Average : 30.0
*/