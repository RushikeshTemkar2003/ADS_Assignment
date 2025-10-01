/*Convert an infix expression to postfix using stack. */
import java.util.*;
class InfixToPostfix
{
   static int prec(char c)
   {
      if(c=='+'||c=='-') return 1;
      if(c=='*'||c=='/') return 2;
      return -1;
   }

   static String convert(String exp)
   {
       String res="";
       Stack<Character> st=new Stack<>();
       for(char c:exp.toCharArray())
       {
          if(Character.isLetterOrDigit(c)) res+=c;
          else if(c=='(') st.push(c);
          else if(c==')')
          {
              while(!st.isEmpty() && st.peek()!='(')
                 res+=st.pop();
              st.pop();
          }
          else
          {
             while(!st.isEmpty() && prec(c)<=prec(st.peek()))
               res+=st.pop();
             st.push(c);
          }
       }
       while(!st.isEmpty())
         res+=st.pop();
       return res;
   }

   public static void main(String args[])
   {
      System.out.println(convert("A+B*C"));
   }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac InfixToPostfix.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java InfixToPostfix
ABC*+
*/
