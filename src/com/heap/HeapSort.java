/*
 * In-place sorting algorithm
 */

package com.heap;

public class HeapSort extends MinHeap{
	
	private int size;
	private int[] arr;
	private int[] sortedArr;
	
	public HeapSort(int[] arr){
		this.size = arr.length;
		this.arr = arr;
		sortedArr = new int[size];
	}
	public void sortAsc(){
		
		MinHeap mHeap = new MinHeap(size);
		mHeap.arr = arr;
		mHeap.createHeap();

		for(int i=0; i< size; i++){
			sortedArr[i] = mHeap.extractMin();
		}
		display();
		System.out.println();
		
		//mHeap.sort();
	}
	
	public void sortDesc(){
		MaxHeap mHeap = new MaxHeap(size);
		mHeap.arr = arr;
		mHeap.createHeap();

		for(int i=0; i< size; i++){
			sortedArr[i] = mHeap.extractMax();
		}
		display();
	}
	
	public void display(){
		for(int i=0; i< size; i++){
			System.out.print(sortedArr[i]+ " ");
		}
	}
}
