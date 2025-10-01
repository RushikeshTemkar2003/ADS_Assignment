/* Inorder, Preorder, Postorder Traversals
Implement recursive functions to print inorder, preorder, and postorder traversals. */
class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}
class TreeTraversals {
    static void inorder(Node r){
	if(r!=null){ 
	inorder(r.left); 
	System.out.print(r.data+" "); 
	inorder(r.right);} }
    static void preorder(Node r){ 
	if(r!=null){ 
	System.out.print(r.data+" "); 
	preorder(r.left); 
	preorder(r.right);} }
    static void postorder(Node r){ 
	if(r!=null){ 
	postorder(r.left); 
	postorder(r.right); 
	System.out.print(r.data+" ");} }
    public static void main(String[] args){
      Node root=new Node(10);
      root.left=new Node(20);
      root.right=new Node(30);
      root.left.left=new Node(40);
      root.left.right=new Node(50);
      inorder(root); System.out.println();
      preorder(root); System.out.println();
      postorder(root);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac TreeTraversals.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java TreeTraversals
40 20 50 10 30
10 20 40 50 30
40 50 20 30 10
*/

