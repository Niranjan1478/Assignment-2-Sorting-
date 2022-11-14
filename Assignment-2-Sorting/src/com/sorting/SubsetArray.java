package com.sorting;

import java.util.Scanner;

public class SubsetArray 
{
	static Scanner sc=new Scanner(System.in);
	public static void subsetArray(int arr[],int arr1[])
	{
		if(arr.length>arr1.length)
		{
			int c=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr1.length;j++)
				{
					if(arr[i]==arr1[j])
						c=c+1;
				}
			}
			if(arr1.length==c)
				System.out.println("Array2 is Subset of Array 1 :)");
			else
				System.out.println("Array2 is not Subset of Array 1 (:");
		}
		else
		{
			int c=0;
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr1[i]==arr[j])
						c=c+1;
				}
			}
			if(arr.length==c)
				System.out.println("Array1 is Subset of Array 2 ):");
			else
				System.out.println("Array1 is not Subset of Array 2 ):");
		}
			
	}
	public static void main(String aaa[])
	{
		System.out.println("Entet the Size of an array 1");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Entet the values to an array 1");
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Entet the Size of an array 2");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		
		System.out.println("Entet the values to an array 2");
		
		for(int i=0;i<arr1.length;i++)
			arr1[i]=sc.nextInt();
		
		subsetArray(arr,arr1);

	}

}
