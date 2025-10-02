/*Implement a Priority Queue (using array or heap).*/

import java.util.*;
class PQueue{
 public static void main(String a[]){
   PriorityQueue<Integer> pq=new PriorityQueue<>();
   pq.add(4);
   pq.add(1); 
   pq.add(7);
   while(!pq.isEmpty()) System.out.print(pq.poll()+" ");
 }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac PQueue.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java PQueue
1 4 7
*/
