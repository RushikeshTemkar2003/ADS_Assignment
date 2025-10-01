/* Reverse a string using stack. */

import java.util.*;
class ReverseString
{
  public static void main(String args[])
  {
      String s="HELLO";
      Stack<Character> st=new Stack<>();
      for(char c:s.toCharArray())
        st.push(c);

      while(!st.isEmpty())
        System.out.print(st.pop());
  }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac ReverseString.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java ReverseString
OLLEH
*/
