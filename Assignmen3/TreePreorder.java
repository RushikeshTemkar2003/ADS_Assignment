/* Create a Binary Tree & Print Preorder Traversal
Write a program to create a binary tree and print its preorder traversal
*/
class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}
class TreePreorder {
  static void preorder(Node root){
    if(root==null)return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
} 
  public static void main(String[] args){
	Node root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	preorder(root);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac TreePreorder.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java TreePreorder
1 2 4 5 3
*/
