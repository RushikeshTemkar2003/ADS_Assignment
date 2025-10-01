/*Merge Sort
Write a recursive program to implement Merge Sort. 
*/
import java.util.*;
class MergeSort{
 static void merge(int[] a,int l,int m,int r){
	int n1=m-l+1,n2=r-m;
	int[] L=new int[n1];int[] R=new int[n2];
	for(int i=0;i<n1;i++)L[i]=a[l+i];
	for(int j=0;j<n2;j++)R[j]=a[m+1+j];
	int i=0,j=0,k=l;
	while(i<n1&&j<n2)a[k++]=L[i]<=R[j]?L[i++]:R[j++];
	while(i<n1)a[k++]=L[i++];
	while(j<n2)a[k++]=R[j++];
}
 static void sort(int[] a,int l,int r){
	if(l<r){
		int m=(l+r)/2;
		sort(a,l,m);
		sort(a,m+1,r);
		merge(a,l,m,r);
	}
}
 public static void main(String[] args){
	int[] arr={38,27,43,3,9,82,10};
	sort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac MergeSort.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java MergeSort
[3, 9, 10, 27, 38, 43, 82]
*/
