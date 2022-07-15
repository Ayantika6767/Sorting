package Sorting;
import java.util.Scanner;
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size then List of array");
				int n= sc.nextInt();
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}
				Sort(arr);
				for(int i=0;i<n;i++)
				{
					System.out.print(arr[i]+" ");
				}
	}
	
	public static void Sort(int[]arr2)
	{
		/*when using bubble sort if no. of elements=n
		 * outer loop: No. of pass= n-1 ,since last element gets sorted automatically
		 * inner loop: n-pass , since in each swap the last elements are getting sorted
		 */
		
		
		for(int pass=0;pass<arr2.length-1;pass++) // or for easy to understand pass=1
		{
			for(int i=0;i<arr2.length-pass-1;i++) // arr2.length-pass
			{
				if(arr2[i]>arr2[i+1])
				{
					int temp=arr2[i];
					arr2[i]=arr2[i+1];
					arr2[i+1]=temp;
					
				}
			}
		}
	}

}
