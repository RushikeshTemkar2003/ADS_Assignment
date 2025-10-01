/*Check if a string of parentheses is balanced using a stack.*/
import java.util.*;
class Balanced
{
  static boolean isBalanced(String s)
  {
    Stack<Character> st=new Stack<>();
    for(char c:s.toCharArray())
    {
        if("({[".indexOf(c)!=-1)
          st.push(c);
        else
        {
           if(st.isEmpty()) return false;
           char top=st.pop();
           if((c==')'&&top!='(')||(c=='}'&&top!='{')||(c==']'&&top!='['))
              return false;
        }
    }
    return st.isEmpty();
  }

  public static void main(String args[])
  {
     System.out.println(isBalanced("({[]})"));
     System.out.println(isBalanced("({[})"));
  }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac Balanced.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java Balanced
true
false
*/
