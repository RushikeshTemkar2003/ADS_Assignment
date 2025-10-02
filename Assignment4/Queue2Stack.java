/* Implement a queue using two stacks.*/

import java.util.*;
class Queue2Stack{
 Stack<Integer> s1=new Stack<>(), s2=new Stack<>();
 void enq(int x){ s1.push(x); }
 int deq(){
   if(s2.isEmpty()){ while(!s1.isEmpty()) s2.push(s1.pop()); }
   if(s2.isEmpty()) return -1;
   return s2.pop();
 }
 public static void main(String a[]){
   Queue2Stack q=new Queue2Stack();
   q.enq(10); 
   q.enq(20);
   q.enq(30);
   System.out.println(q.deq());
   System.out.println(q.deq());
 }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac Queue2Stack.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java Queue2Stack
10
20
*/
