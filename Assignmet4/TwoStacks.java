/* Implement two stacks in a single array. */
class TwoStacks
{
   int arr[],top1,top2,size;
   TwoStacks(int n)
   {
      size=n;
      arr=new int[n];
      top1=-1; top2=n;
   }

   void push1(int x){arr[++top1]=x;}
   void push2(int x){arr[--top2]=x;}
   int pop1(){return arr[top1--];}
   int pop2(){return arr[top2++];}

   public static void main(String args[])
   {
       TwoStacks ts=new TwoStacks(10);
       ts.push1(5); ts.push2(100);
       System.out.println(ts.pop1());
       System.out.println(ts.pop2());
   }
}

 /*
 C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac TwoStacks.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java TwoStacks
5
100
*/
