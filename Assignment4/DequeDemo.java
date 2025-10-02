/*. Implement a Double Ended Queue (Deque).*/

import java.util.*;
class DequeDemo{
 public static void main(String a[]){
   Deque<Integer> dq=new LinkedList<>();
   dq.addFirst(10); 
   dq.addLast(20);
   dq.addFirst(5); 
   dq.addLast(30);
   System.out.println(dq);
   dq.removeFirst();
   dq.removeLast();
   System.out.println(dq);
 }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac DequeDemo.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java DequeDemo
[5, 10, 20, 30]
[10, 20]
*/
