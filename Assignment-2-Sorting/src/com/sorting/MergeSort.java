package com.sorting;

import java.util.Scanner;

public class MergeSort 
{
	
	static Scanner sc=new Scanner(System.in);
	void merge(int arr[], int l, int m, int r)
	{
		
		int n1 = m - l + 1;
		int n2 = r - m;  int L[] = new int[n1]; int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0; int k = l;
		
		while (i < n1 && j < n2) 
		{
			if (L[i] <= R[j]) 
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) 
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			int m = l + (r - l) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public static void main(String aaa[])
	{
		System.out.println("Entet the Size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Entet the values to an array");
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println(" Before Sorting ");
		for(int ele:arr)
			System.out.print(ele+" ");
		
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\n After Merge Sort array");
		for(int ele:arr)
			System.out.print(ele+" ");
	}

}
