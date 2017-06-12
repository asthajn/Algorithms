package com.heap;

public class Heap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrA[] = {3, 2, 1, 7, 8, 4, 10, 16, 12};
		MinHeap mHeap = new MinHeap(arrA.length);
		mHeap.arr = arrA;
		mHeap.createHeap();
		mHeap.display();
		System.out.print("Extract Min :");
		for(int i=0;i<arrA.length;i++){
			System.out.print("  " + mHeap.extractMin());
		}
		System.out.println();
		
		int arrmax[] = {3, 2, 1, 7, 8, 4, 10, 16, 12};
		MaxHeap maxHeap = new MaxHeap(arrA.length);
		maxHeap.arr = arrmax;
		maxHeap.createHeap();
		maxHeap.display();
		System.out.print("Extract Max :");
		for(int i=0;i<arrA.length;i++){
			System.out.print("  " + maxHeap.extractMax());
		}
	}
}
