package com.sorting;

import java.util.Scanner;

public class BubbleSort
{
	static Scanner sc=new Scanner(System.in);
	public static  void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}

		System.out.println("After Bubble Sort Elements are : ");
		for(int ele:arr)
			System.out.print(ele+" ");
	}
	public static void main(String aaa[])
	{
		System.out.println("Entet the Size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		

		System.out.println("Entet the values to an array");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Elements u have enterd");
		for(int ele:arr)
			System.out.print(ele+" ");
		
		System.out.println();
		bubbleSort(arr);
		
	}
	
}
