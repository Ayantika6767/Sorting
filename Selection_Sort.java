package Sorting;
import java.util.Scanner;
public class Selection_Sort {

	
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
				
				
				for(int i=0;i<arr2.length;i++) 
				{	 int element=arr2[i];        //selects one element and compares 
					for(int j=i+1;j<arr2.length;j++) // if found less than element it will swap
					{
						if(arr2[j]<arr2[i])
						{
							int temp=arr2[i];
							arr2[i]=arr2[j];
							arr2[j]=temp;
							
						}
					}
				}
			}

		}


