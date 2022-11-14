package com.sorting;

import java.util.Scanner;

public class SelectionSort
{
	public static void selectionSort(int[] arr)
	{  
       for (int i = 0; i < arr.length - 1; i++)  
       {  
           int index = i;  
           for (int j = i + 1; j < arr.length; j++)
           {  
                if (arr[j] < arr[index]){  
                    index = j;
            }  
       }  
         int temp = arr[index];   
         arr[index] = arr[i];  
         arr[i] = temp;
       }
       System.out.println("After Selection Sort Elements are : ");
       for(int ele:arr)
			System.out.print(ele+" ");
}  
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
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
		selectionSort(arr);
	}

}
