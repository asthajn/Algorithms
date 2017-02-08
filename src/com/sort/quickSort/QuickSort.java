//Worst case: O(n^2)
//Average Case: O(n*logn)

package com.sort.quickSort;
public class QuickSort {
	
	void swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	int partition(int[] arr, int left, int right){
		int i = left;
		int j = right;
		int pivot = arr[left + (right-left)/2];
		int tmp;
		
		while(i <= j){
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			
			if(i<=j){
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	void quickSort(int[] arr, int left, int right){
		
		//get index of the sorted pivot
		int index = partition(arr, left, right);
		
		if(left < index-1)
			quickSort(arr, left, index-1);
		if(right > index)
			quickSort(arr, index, right);
	}
	
	public static void main(String args[]){
		System.out.println("Astha's QuickSort Algorithm");
		int[] arr = {2,4,7,8,6,5,5,10,11};
		int len = arr.length;
		
		QuickSort sort = new QuickSort();
		
		sort.quickSort(arr, 0, len-1);
		int j;
		System.out.println("Sorted array :");
		System.out.print(arr[0]);
		for(j=1; j<arr.length; j++)
			System.out.print(" , " + arr[j]);
	}
}
