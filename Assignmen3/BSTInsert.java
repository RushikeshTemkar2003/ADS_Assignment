/* Insert into a BST
Write a program to insert nodes into a BST and print inorder traversal. 
*/

class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}
class BSTInsert {
 static Node insert(Node root,int key){
	if(root==null) return new Node(key);
	if(key<root.data) root.left=insert(root.left,key);
	else root.right=insert(root.right,key);
	return root;
}
 static void inorder(Node r){ 
 if(r!=null){
 inorder(r.left); 
 System.out.print(r.data+" "); 
 inorder(r.right);} }
public static void main(String[] args){
	int[] vals={50,30,20,40,70,60,80};
	Node root=null;
	for(int v:vals) root=insert(root,v);
	inorder(root);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac BSTInsert.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java BSTInsert
20 30 40 50 60 70 80
*/
