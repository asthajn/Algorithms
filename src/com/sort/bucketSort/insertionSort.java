//Worst case: O(n^2)
//Average Case: O(n^2)

package com.sort.bucketSort;
public class insertionSort {
	
	public static void swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void InsertionSort(int[] arr, int len){
		
		int i, j, tmp;
		for(i = 1; i < len; i++){
			j=i;
			while((arr[j] < arr[j-1]) && j > 0){
				//System.out.println("swapping "+arr[j] + " , "+arr[j-1]);
				//swap(arr, arr[j], arr[j-1]);
				tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
				j-- ;
			}
		}
		System.out.println("Sorted array :");
		System.out.print(arr[0]);
		for(j=1; j<len; j++)
			System.out.print(" , " + arr[j]);
	}
	
	public static void main(String args[]){
		System.out.println("Astha's Insertion sort");
		int[] arr = {2,4,7,8,6,5,5,10,11};
		int len = arr.length;
		if(len > 0)
			InsertionSort(arr, len);
	}

	public void InsertionSort(Integer[] arr, int len) {
		// TODO Auto-generated method stub
		int i, j, tmp;
		for(i = 1; i < len; i++){
			j=i;
			while((arr[j] < arr[j-1]) && j > 0){
				//System.out.println("swapping "+arr[j] + " , "+arr[j-1]);
				//swap(arr, arr[j], arr[j-1]);
				tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
				j-- ;
			}
		}
		
	}
}
