/* Find the next greater element for each element in an array using stack. */
import java.util.*;
class NextGreater
{
   public static void main(String args[])
   {
       int arr[]={4,5,2,25};
       int n=arr.length;
       int res[]=new int[n];
       Stack<Integer> st=new Stack<>();

       for(int i=n-1;i>=0;i--)
       {
          while(!st.isEmpty() && st.peek()<=arr[i])
              st.pop();
          res[i]=st.isEmpty()?-1:st.peek();
          st.push(arr[i]);
       }

       System.out.println(Arrays.toString(res));
   }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac NextGreater.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java NextGreater.java
[5, 25, 25, -1]
*/
