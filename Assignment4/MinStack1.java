/*Design a stack that supports getMin() in O(1) time.*/

class MinStack{
 int arr[]=new int[100];
 int top=-1;
 int minArr[]=new int[100];
 int minTop=-1;

 void push(int x){
   arr[++top]=x;
   if(minTop==-1 || x<=minArr[minTop]) minArr[++minTop]=x;
 }
 int pop(){
   int val=arr[top--];
   if(val==minArr[minTop]) minTop--;
   return val;
 }
 int getMin(){
   return minArr[minTop];
 }
 public static void main(String args[]){
   MinStack st=new MinStack();
   st.push(3); st.push(5); st.push(2); st.push(1);
   System.out.println("Min="+st.getMin());
   st.pop();
   System.out.println("Min="+st.getMin());
 }
}
