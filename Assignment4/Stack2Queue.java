/* Implement a stack using two queues.*/

import java.util.*;
class Stack2Queue{
 Queue<Integer> q1=new LinkedList<>(),q2=new LinkedList<>();
 void push(int x){ q1.add(x);}
 int pop(){
   if(q1.isEmpty()) return -1;
   while(q1.size()>1) q2.add(q1.remove());
   int val=q1.remove();
   Queue<Integer> tmp=q1; 
   q1=q2; 
   q2=tmp;
   return val;
 }
 public static void main(String a[]){
   Stack2Queue st=new Stack2Queue();
   st.push(5);
   st.push(6); 
   st.push(7);
   System.out.println(st.pop());
   System.out.println(st.pop());
 }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac Stack2Queue.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java Stack2Queue
7
6
*/
