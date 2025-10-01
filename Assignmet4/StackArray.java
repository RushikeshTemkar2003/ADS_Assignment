/*Implement a Stack using arrays*/
class StackArray
{
   int top ,size;
   int arr[];

   StackArray(int n)
   {
       size=n;
       arr=new int[n];
       top=-1;
   }

   void push(int x)
   {
      if(top==size-1)
        {
         System.out.println("Stack Overflow");
         return;
        }
      arr[++top]=x;
   }

   int pop()
   {
     if(top==-1)
        {
          System.out.println("Stack Underflow");
          return -1;
        }
     return arr[top--];
   }

   int peek()
   {
     if(top==-1) return -1;
     return arr[top];
   }

   void display()
   {
       for(int i=top;i>=0;i--)
         System.out.print(arr[i]+" ");
       System.out.println();
   }

   public static void main(String args[])
   {
       StackArray s=new StackArray(5);
       s.push(10);
       s.push(20);
       s.push(30);
       s.display();
       System.out.println(s.pop());
       System.out.println(s.peek());
   }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac StackArray.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java StackArray
30 20 10
30
20
*/
