package com.sort.bucketSort;
import java.util.ArrayList;
import java.util.List;

public class BucketSort{
	
	
	private static int DEFAULT_BUCKET_SIZE = 5;
	private static int len;
	
	static int setLength(Integer[] arr){
		return arr.length;
	}
	
	public static void sort(Integer[] arr){
		sort(arr, DEFAULT_BUCKET_SIZE);
	}

	private static void sort(Integer[] arr, int bucketSize) {
		
		if(len == 0)
			return;
		/*Steps:
		 * create buckets using maximum and minimum values from the given array
		 * create a list of lists
		 * put elements in the lists
		 * sort elements in the lists
		 * put elements back into the original array*/
		
		// 1 ---------
		
		Integer min = arr[0];
		Integer max = arr[0];
		
		int i, j, bucketCount;
		
		for(i = 1; i<len ; i++ ){
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		
		// Calculating Bucket Counts
		bucketCount = (max - min)/bucketSize + 1;
		
		//Initialize buckets
		List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
		//Add lists to buckets
		for(i = 0; i<bucketCount; i++){
			buckets.add(new ArrayList<Integer>());
		}
		
		//Add elements to the ArrayLists
		for(i = 0; i < len; i++){
			buckets.get((arr[i] - min)/bucketSize).add(arr[i]);
		}
		
		insertionSort inSort = new insertionSort();
		//Sort the arraylists individually and put the elements back to the original array
		int count = 0;
		for(i = 0; i<buckets.size(); i++){
			Integer[] bucketArray = new Integer[buckets.get(i).size()];
			bucketArray = buckets.get(i).toArray(bucketArray);
			inSort.InsertionSort(bucketArray, bucketArray.length);
			for(j = 0; j<bucketArray.length; j++){
				arr[count++] = bucketArray[j];
			}
		}
	}
	
	private static void printSort(Integer[] arr){
    	for(int i=0; i< len; i++){
    		System.out.print(arr[i]+ "  ");
    	}
	}
	
	public static void main(String[] args){
		
		System.out.println("Astha's BucketSort Algorithm");
		Integer[] arr = new Integer[]{2,4,7,8,6,5,5,10,11};
		
		len = setLength(arr);
		sort(arr);
		printSort(arr);
	}
	
};