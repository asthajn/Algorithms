//Worst case: O(n+k)
//Worst Case space: O(n+k)

package com.sort.countsort;
public class CountingSort {

	CountingSort(char[] arr){
		
		int n = arr.length;
		int i;
		int[] count = new int[256];
		char[] output = new char[n];
		
		for(i=0; i < 256; i++){
			count[i] = 0;
		}
		
		for(i = 0; i < n; i++){
			count[arr[i]]++;
		}
		
		for(i = 1; i <= 255; i++){
			count[i] += count[i-1];
		}
		
		for(i = 0; i < n; i++){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		
		for(i = 0; i < n; i++){
			arr[i] = output[i];
		}
		
	}
	
	void printSort(char[] arr){
		int i;
		int n= arr.length;
		for(i = 0; i < n; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Astha's Counting Sort Algorithm");
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'
               };
		
		CountingSort sort = new CountingSort(arr);
		sort.printSort(arr);
		
	}

}
