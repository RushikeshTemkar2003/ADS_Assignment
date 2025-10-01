/*Calculate the sum of all array elements. Solve this problem using iterative and recursion method */
import java.util.*;
class SumArray{
 static int sumIter(int a[]){
	int s=0;
	for(int x:a) s+=x;
	return s;
}
 static int sumRec(int a[],int n){
	if(n==0) return 0;
	return a[n-1]+sumRec(a,n-1);
}
 public static void main(String args[]){
	int arr[]={1,2,3,4,5};
	System.out.println("Sum Iterative : "+sumIter(arr));
	System.out.println("Sum Recursive : "+sumRec(arr,arr.length));
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac SumArray.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java SumArray
Sum Iterative : 15
Sum Recursive : 15
*/