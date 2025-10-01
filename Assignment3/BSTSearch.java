/* Search in BST
Write a program to search for a value in a BST. Return true if found, false otherwise. 
*/

class BSTSearch {
 static boolean search(Node r,int key){
	if(r==null) return false;
	if(r.data==key) return true;
	return key<r.data?search(r.left,key):search(r.right,key);
}
 public static void main(String[] args){
	int[] vals={50,30,20,40,70,60,80};
	Node root=null;
	for(int v:vals) root=BSTInsert.insert(root,v);
	System.out.println(search(root,40)?"Found":"Not Found");
	System.out.println(search(root,90)?"Found":"Not Found");
}
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac BSTSearch.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java BSTSearch
Found
Not Found
*/
