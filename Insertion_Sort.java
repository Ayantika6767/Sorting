package Sorting;
import java.util.Scanner;
public class Insertion_Sort {

	
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
						//ex= 8 9 4 2 1 11 89
						
						for(int i=1;i<arr2.length;i++) 
						{	
							int j=i-1;        //8
							int item= arr2[i];//9
							while(j>=0 && item < arr2[j])
							{
								arr2[j+1]=arr2[j];
								j--;
							}
							j++;
							arr2[j]=item;
						}
					}

				}



