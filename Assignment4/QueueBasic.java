/*Write a program to enqueue, dequeue, and display elements of a queue. */

class QueueBasic{
 int arr[]=new int[5]; 
 int f=0,r=-1,sz=0;
 void enqueue(int x){ 
 if(sz==arr.length)
 return; 
 r=(r+1)%arr.length;
 arr[r]=x; 
 sz++; }
 int dequeue(){
 if(sz==0) return -1; 
 int v=arr[f]; f=(f+1)%arr.length; 
 sz--; 
 return v; }
 void display(){ 
 for(int i=0;i<sz;i++) 
 System.out.print(arr[(f+i)%arr.length]+" ");
 System.out.println(); }
 public static void main(String a[]){
   QueueBasic q=new QueueBasic();
   q.enqueue(11); 
   q.enqueue(22); 
   q.display(); 
   q.dequeue(); 
   q.display();
 }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac QueueBasic.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java QueueBasic
11 22
22
*/
