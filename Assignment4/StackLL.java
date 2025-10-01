/*Implement a Stack using linked list*/
class StackLL
{
   class Node
   {
     int data;
     Node next;
     Node(int d){data=d;}
   }

   Node top;

   void push(int x)
   {
      Node n=new Node(x);
      n.next=top;
      top=n;
   }

   int pop()
   {
      if(top==null) return -1;
      int x=top.data;
      top=top.next;
      return x;
   }

   int peek()
   {
      if(top==null) return -1;
      return top.data;
   }

   void display()
   {
      Node t=top;
      while(t!=null)
      {
         System.out.print(t.data+" ");
         t=t.next;
      }
      System.out.println();
   }

   public static void main(String args[])
   {
       StackLL s=new StackLL();
       s.push(5); s.push(15); s.push(25);
       s.display();
       System.out.println(s.pop());
   }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac StackLL.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java StackLL
25 15 5
25
*/
