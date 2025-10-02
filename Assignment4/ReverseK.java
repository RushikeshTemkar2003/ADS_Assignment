/* Reverse the first K elements of a queue.*/
import java.util.*;
class ReverseK{
 static void reverse(Queue<Integer> q,int k){
   Stack<Integer> st=new Stack<>();
   for(int i=0;i<k;i++) st.push(q.remove());
   while(!st.isEmpty()) q.add(st.pop());
   int n=q.size(); for(int i=0;i<n-k;i++) q.add(q.remove());
 }
 public static void main(String a[]){
   Queue<Integer> q=new LinkedList<>();
   for(int i=1;i<=5;i++) q.add(i);
   reverse(q,3);
   System.out.println(q);
 }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac ReverseK.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java ReverseK.java
[3, 2, 1, 4, 5]
*/
