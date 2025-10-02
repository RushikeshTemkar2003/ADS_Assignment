/*Write a program to push, pop, peek, and display elements of a stack.*/
import java.util.*;

class StackDemo{
 int arr[]=new int[10];
 int top=-1;

 void push(int x){
   if(top==arr.length-1){ 
     System.out.println("Stack full"); return;
   }
   arr[++top]=x;
   System.out.println(x+" pushed");
 }

 int pop(){
   if(top==-1){ 
     System.out.println("Empty"); return -1;
   }
   return arr[top--];
 }

 int peek(){
   if(top==-1){ 
     System.out.println("Empty"); return -1;
   }
   return arr[top];
 }

 void display(){
   if(top==-1){ System.out.println("Empty"); return; }
   for(int i=0;i<=top;i++) System.out.print(arr[i]+" ");
   System.out.println();
 }

 public static void main(String a[]){
   StackDemo st=new StackDemo();
   st.push(10);
   st.push(20);
   st.push(30);
   st.display();
   System.out.println("Top element="+st.peek());
   System.out.println("Popped="+st.pop());
   st.display();
 }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac StackDemo.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java StackDemo
10 pushed
20 pushed
30 pushed
10 20 30
Top element=30
Popped=30
10 20*/
