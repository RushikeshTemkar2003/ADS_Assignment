/* Evaluate a postfix expression using stack. */
import java.util.*;
class PostfixEval
{
  static int eval(String exp)
  {
     Stack<Integer> st=new Stack<>();
     for(char c:exp.toCharArray())
     {
        if(Character.isDigit(c))
           st.push(c-'0');
        else
        {
          int b=st.pop();
          int a=st.pop();
          switch(c)
          {
             case '+': st.push(a+b); break;
             case '-': st.push(a-b); break;
             case '*': st.push(a*b); break;
             case '/': st.push(a/b); break;
          }
        }
     }
     return st.pop();
  }

  public static void main(String args[])
  {
     System.out.println(eval("231*+9-"));
  }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac PostfixEval.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java PostfixEval
-4
*/
