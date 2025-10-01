/*Bubble Sort
Write a program to implement Bubble Sort on an integer array. 
*/
class BubbleSort {
 public static void main(String[] args) {
	int[] arr = {5, 2, 9, 1, 5, 6};

	for(int i=0;i<arr.length-1;i++){
	  for(int j=0;j<arr.length-1-i;j++){
		if(arr[j] > arr[j+1]){
    	 int temp = arr[j];
   		 arr[j] = arr[j+1];
		arr[j+1] = temp;
		}
		}
	}

	System.out.print("Sorted: ");
	for(int x: arr) System.out.print(x+" ");
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>javac BubbleSort.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment3>java BubbleSort
Sorted: 1 2 5 5 6 9
*/
