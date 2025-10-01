/* Level Order Traversal (BFS)
Implement level-order traversal of a binary tree. 
*/
import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}

class LevelOrder {
 static void levelOrder(Node root){
	Queue<Node> q=new LinkedList<>();
	q.add(root);
	while(!q.isEmpty()){
		Node n=q.poll();
		System.out.print(n.data+" ");
		if(n.left!=null)q.add(n.left);
		if(n.right!=null)q.add(n.right);
	}
}
 public static void main(String[] args){
	Node root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	root.right.left=new Node(6);
	root.right.right=new Node(7);
	levelOrder(root);
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac LevelOrder.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java LevelOrder
1 2 3 4 5 6 7
*/

