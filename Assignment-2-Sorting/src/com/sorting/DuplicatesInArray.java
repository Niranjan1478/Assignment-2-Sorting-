package com.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicatesInArray
{

	static Scanner sc=new Scanner(System.in);
	public static void findDuplicates(int arr[])
	{
		
		ArrayList<Integer>ar=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					ar.add(arr[i]);
				}
				
			}
		}
		System.out.println("Duplicates in above array");
		for(int ele:ar)
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
		
		
		findDuplicates(arr);
	}

}
