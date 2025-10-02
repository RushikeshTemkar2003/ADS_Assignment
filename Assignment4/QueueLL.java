/*Implement a Queue using linked list.*/
class Node{
 int data; Node next;
 Node(int d){ data=d; }
}
class QueueLL{
 Node front,rear;
 void enqueue(int x){
   Node n=new Node(x);
   if(rear==null){ front=rear=n; }
   else{ rear.next=n; rear=n; }
 }
 int dequeue(){
   if(front==null){ System.out.println("Empty"); return -1;}
   int v=front.data; front=front.next;
   if(front==null) rear=null;
   return v;
 }
 void display(){
   Node t=front;
   while(t!=null){ System.out.print(t.data+" "); t=t.next;}
   System.out.println();
 }
 public static void main(String args[]){
   QueueLL q=new QueueLL();
   q.enqueue(10); q.enqueue(20); q.enqueue(30);
   q.display(); q.dequeue(); q.display();
 }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac QueueLL.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java QueueLL
10 20 30
20 30

*/
