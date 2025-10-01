/*. Find the maximum element in an array. Solve this problem using iterative and recursion method*/

import java.util.*;
class MaxArray{
   static int maxIter(int a[]){
	int m=a[0];
	for(int i=1;i<a.length;i++)
		if(a[i]>m) m=a[i];
	return m;
    }
 static int maxRec(int a[],int n){
	if(n==1) return a[0];
	int t=maxRec(a,n-1);
	return a[n-1]>t?a[n-1]:t;
    }
  public static void main(String args[]){
	int arr[]={10,25,47,3,19};
	System.out.println("Iterative Max : "+maxIter(arr));
	System.out.println("Recursive Max : "+maxRec(arr,arr.length));
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java MaxArray
Iterative Max : 47
Recursive Max : 47
*/