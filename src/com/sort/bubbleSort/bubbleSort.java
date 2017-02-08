//Worst case: O(n^2)
//Average Case: O(n^2)
package com.sort.bubbleSort;
public class bubbleSort {
	
	public static void bubblesort(int[] arr, int len){

	int j;
	int n = len;
	int tmp;
		for(int i=0; i<len-1; i++){
			for(j=0; j< n-1; j++){
				if(arr[j] > arr[j+1]){
					//swap(arr[j], arr[j+1]);
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			n = n-1;
		}
		System.out.println("Sorted array :");
		System.out.print(arr[0]);
		for(j=1; j<len; j++)
			System.out.print(" , " + arr[j]);
	}
	
	public static void main(String args[]){
		System.out.println("Astha's Bubble sort");
		int[] arr = {2,4,7,8,6,5,5,10,11};
		int len = arr.length;
		if(len > 0)
			bubblesort(arr, len);
	}
}
