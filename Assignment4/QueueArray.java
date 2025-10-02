/*Implement a Queue using arrays.*/

class QueueArray{
 int arr[]=new int[5];
 int front=0,rear=-1,size=0;

 void enqueue(int x){
   if(size==arr.length){ System.out.println("Full"); return; }
   rear=(rear+1)%arr.length;
   arr[rear]=x; size++;
 }
 int dequeue(){
   if(size==0){ System.out.println("Empty"); return -1; }
   int val=arr[front];
   front=(front+1)%arr.length; size--;
   return val;
 }
 void display(){
   for(int i=0;i<size;i++){
     System.out.print(arr[(front+i)%arr.length]+" ");
   } System.out.println();
 }
 public static void main(String args[]){
   QueueArray q=new QueueArray();
   q.enqueue(1); q.enqueue(2); q.enqueue(3);
   q.display();
   q.dequeue(); q.display();
 }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac QueueArray.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java QueueArray
1 2 3
2 3
*/
