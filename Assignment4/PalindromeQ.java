/*Check if a queue is palindrome (using stack or two-pointer approach).*/
import java.util.*;
class PalindromeQ{
 public static void main(String a[]){
   Queue<Integer> q=new LinkedList<>();
   q.add(1);
   q.add(2);
   q.add(3);
   q.add(2);
   q.add(1);
   ArrayList<Integer> list=new ArrayList<>(q);
   int i=0,j=list.size()-1; 
   boolean pal=true;
   while(i<j){ 
   if(!list.get(i).equals(list.get(j))){ pal=false; break;} i++; j--; }
   System.out.println("Palindrome? "+pal);
 }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>javac PalindromeQ.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignmet4>java PalindromeQ
Palindrome? true
*/
