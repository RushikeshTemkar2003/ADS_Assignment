/* Minimum & Maximum Node in BST
Find the smallest and largest element in a BST. 
*/

class BSTMinMax {
   static int min(Node r){ 
    while(r.left!=null) r=r.left; 
	 return r.data; }
    static int max(Node r){ 
	 while(r.right!=null) r=r.right; 
	  return r.data; }
    public static void main(String[] args){
	int[] vals={50,30,20,40,70,60,80};
	Node root=null;
	for(int v:vals) root=BSTInsert.insert(root,v);
	System.out.println("Min: "+min(root));
	System.out.println("Max: "+max(root));
}
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac BSTMinMax.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java BSTMinMax
Min: 20
Max: 80
*/
