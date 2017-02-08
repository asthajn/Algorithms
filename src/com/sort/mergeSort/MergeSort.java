//Worst case: O(n*logn)
//Average Case: O(n*logn)

package com.sort.mergeSort;
public class MergeSort {
	
	private static int[] arr = {2,4,7,8,6,5,5,10,11};
	private static int len = arr.length;
	private int[] helper = new int[len];
	
	private void mergeOrConquer(int left, int mid, int right){
		
		for(int cnt = left; cnt<= right; cnt++){
			helper[cnt] = arr[cnt]; 
		}
		int i = left;
		int j = mid+1;
		int k = left;	
		
		while(i<=mid && j<=right){
			if(helper[i] <= helper[j]){
				arr[k] = helper[i];
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		//Copy rest of the left side of the array to main array
		while(i<=mid){
			arr[k] = helper[i];
			i++;
			k++;
		}

	}
	
	private void divide(int left, int right){
		
		if(left < right){
			int middle = left+(right-left)/2;
			divide(left, middle);
			divide(middle+1, right);
			
			mergeOrConquer(left, middle, right);
		}
		
	}
	
	public static void main(String args[]){
		System.out.println("Astha's MergeSort Algorithm");
		
		MergeSort sort = new MergeSort();
		
		sort.divide(0, len-1);
		int j;
		System.out.println("Sorted array :");
		System.out.print(arr[0]);
		for(j=1; j<arr.length; j++)
			System.out.print(" , " + arr[j]);
	}
}
