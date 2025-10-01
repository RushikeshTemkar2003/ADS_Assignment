/* Check if a Binary Tree is Balanced
A balanced tree means the height difference of left and right subtrees for every node is ≤ 1. 
*/
class TreeBalanced {
 static int check(Node r){
	if(r==null) return 0;
	int l=check(r.left); if(l==-1) return -1;
	int rr=check(r.right); if(rr==-1) return -1;
	if(Math.abs(l-rr)>1) return -1;
	return 1+Math.max(l,rr);
}
 public static void main(String[] args){
	Node root=new Node(1);
	root.left=new Node(2);
	root.left.left=new Node(3);
	System.out.println(check(root)!=-1);
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac TreeBalanced.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java TreeBalanced
false
*/
