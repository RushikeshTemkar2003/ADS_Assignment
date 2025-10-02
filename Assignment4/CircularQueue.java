/* Implement a Circular Queue using arrays.*/
class CircularQueue{
 int arr[]=new int[5]; 
 int f=0,r=-1,sz=0;
 void enq(int x){ 
 if(sz==arr.length) {
 System.out.println("Full");
 return;}
 r=(r+1)%arr.length; arr[r]=x; sz++; }
 int deq(){
 if(sz==0) {
 System.out.println("Empty");
 return -1;} 
 int v=arr[f]; f=(f+1)%arr.length; sz--; 
 return v;}
 void show(){ 
 for(int i=0;i<sz;i++) 
 System.out.print(arr[(f+i)%arr.length]+" "); 
 System.out.println();}
 public static void main(String a[]){ 
 CircularQueue cq=new CircularQueue(); 
 cq.enq(5);
 cq.enq(6);
 cq.enq(7); 
 cq.show(); 
 cq.deq(); 
 cq.show();}
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac CircularQueue.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java CircularQueue
5 6 7
6 7
*/
