package ARRAY;
import java.util.*;

public class hashest {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        for (int i = 0; i < size; i++) 
	        	arr[i] = sc.nextInt();
	        HashSet hash = new HashSet();
		    for(int i = 0 ; i < size; i++)
		    {
		        if(hash.contains(arr[i])||arr[i]<=0) 
		        	System.out.print(arr[i] + " ");
		        else hash.add(arr[i]);
		    }
		    //Scan.closed();
	    }
	}

