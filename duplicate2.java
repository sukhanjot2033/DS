package ARRAY;
//element after the zero which is repeated is not shown
public class duplicate2 {

	void printRepeating(int arr[], int size) 
	{ 
		int i; 
		System.out.println("The repeating elements are : "); 
	
		for (i = 0; i < size; i++) 
		{ 
			if (arr[ Math.abs(arr[i])] >= 0) 
				arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
			else
				System.out.print(Math.abs(arr[i]) + " "); 
		}		 
	} 

	// Driver program 
	public static void main(String[] args) 
	{ 
	duplicate2 duplicatei = new duplicate2(); 
		int arr[] = {1, 0, 3, 1,3,0,5,5, 6, 6,4,4}; 
		int arr_size = arr.length; 

		duplicatei.printRepeating(arr, arr_size); 
	} 
} 
