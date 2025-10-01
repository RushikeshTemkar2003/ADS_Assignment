/* . Height of Binary Tree
Write a recursive function to find the height of a binary tree. 
*/
class TreeHeight {
 static int height(Node r){
	if(r==null) return 0;
	return 1+Math.max(height(r.left),height(r.right));
}
 public static void main(String[] args){
	Node root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	System.out.println(height(root));
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac TreeHeight.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java TreeHeight
3
*/
