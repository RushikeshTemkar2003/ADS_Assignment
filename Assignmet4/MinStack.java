/* Design a stack that supports getMin() in O(1) time.  */
import java.util.*;
class MinStack
{
   Stack<Integer> st=new Stack<>();
   Stack<Integer> min=new Stack<>();

   void push(int x)
   {
      st.push(x);
      if(min.isEmpty()||x<=min.peek())
          min.push(x);
   }

   int pop()
   {
      int x=st.pop();
      if(x==min.peek()) min.pop();
      return x;
   }

   int getMin(){return min.peek();}

   public static void main(String args[])
   {
       MinStack s=new MinStack();
       s.push(5); s.push(3); s.push(7);
       System.out.println(s.getMin());
       s.pop();
       System.out.println(s.getMin());
   }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac  MinStack.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java  MinStack
3
3
*/
