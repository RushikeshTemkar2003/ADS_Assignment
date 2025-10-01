/* Convert Sorted Array to Balanced BST
Write a program to convert a sorted array into a balanced BST. 
*/
class SortedArrayToBST {
 static Node build(int[] a,int l,int r){
	if(l>r) return null;
	int m=(l+r)/2;
	Node root=new Node(a[m]);
	root.left=build(a,l,m-1);
	root.right=build(a,m+1,r);
	return root;
}
 static void preorder(Node r){
	if(r!=null){
		System.out.print(r.data+" ");
		preorder(r.left);
		preorder(r.right);
	}
}
 public static void main(String[] args){
	int[] arr={1,2,3,4,5,6,7};
	Node root=build(arr,0,arr.length-1);
	preorder(root);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac SortedArrayToBST.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java SortedArrayToBST
4 2 1 3 6 5 7
*/
