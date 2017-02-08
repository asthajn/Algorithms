//Worst case: O(wn)
//Worst Case space: O(w+N)

package com.sort.radixSort;
public class RadixSort {
	
	private static int len;
	private static int max=0;
	
	static int getMax(int[] arr){
		int i;
		
		for(i=0; i<len; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	static void counting(int[] arr, int e){
		
		int i;
		int[] count = new int[10];
		int[] output = new int[len];
		
		for(i=0; i < 9; i++){
			count[i] = 0;
		}
		
		for(i = 0; i < len; i++){
			count[(arr[i]/e)%10]++;
		}
		
		for(i = 1; i <= 9; i++){
			count[i] += count[i-1];
		}
		//it goes n-1 to 0 so that what comes first is placed first for digit > LSD
		for(i = len-1; i >= 0; i--){
			output[count[(arr[i]/e)%10]-1] = arr[i];
			count[(arr[i]/e)%10]--;
		}
		
		for(i = 0; i < len; i++){
			arr[i] = output[i];
		}
	}
	
	static void sort(int[] arr){
		
		int i;
		int m = getMax(arr);
		
		for(i = 1; m/i> 0; i*=10){
			counting(arr,i);
		}
	}
	
	static void printSort(int[] arr){
		int i;
		for(i = 0; i < len; i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Astha's Radix Sort Algorithm");
		int[] arr = {2,4,7,8,6,5,5,10,11};
		
		len = arr.length;
		sort(arr);
		printSort(arr);
		
	}

}
