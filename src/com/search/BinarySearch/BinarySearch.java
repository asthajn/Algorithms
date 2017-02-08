

package com.search.BinarySearch;
public class BinarySearch {
	
	static int searchThis = 78; 
	private static int len;
	
	static int setLength(Integer[] arr){
		return arr.length;
	}
	
	public static Integer binarySearch(Integer[] arr, int first, int last){
		
		if(last < first)
			return -1;
		else{
			Integer mid;
			mid = first + (last-first)/2;
			if(arr[mid] == searchThis)
				return mid;
			else if(arr[mid] > searchThis){
				return binarySearch(arr, first, mid-1);
			}
			else if(arr[mid] < searchThis){
				return binarySearch(arr, mid+1, last);
			}	
		}
		return -1;
	}

	private static void printSort(Integer index){
		if(index == -1){
			System.out.println("Element not found");
		}else
			System.out.println("Element at index "+index);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Astha's Binary Search Algorithm");
		Integer[] arr = new Integer[]{1,2,4,7,34,56,78,90,100};
		
		len = setLength(arr);
		Integer index = binarySearch(arr, 0, len-1);
		printSort(index);

	}

}
