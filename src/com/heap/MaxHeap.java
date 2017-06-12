package com.heap;

public class MaxHeap {
	
	private int size;
	private int p = 1;
	public int[] arr;
	private int[] mH;
	public MaxHeap(int size){
		this.size = size;
		this.mH = new int [this.size+1];
	}

	public void createHeap(){
		int i = 0;
		for( ; i < size; i++){
			insert(arr[i]);
			p = p+1;
		}
		p--;
	}
	
	public void insert(int a){
		mH[p] = a;
		bubbleUp();
	}
	
	public void bubbleUp(){
		if(mH[p] < mH[p/2] && p/2 > 0){
			swap(p, p/2);
		}
	}
	
	public int extractMax(){
		int min = mH[1];
		mH[1]=mH[p-1];
		mH[p-1]=0;
		p--;		
		sinkDown(1);
		return min;
	}
	
	public void sinkDown(int loc){

			int leftP = 2*loc;
			int rightP = leftP+1;
			
			int largest = loc;
			if(leftP < p && mH[leftP] > mH[largest]){
				largest = leftP;
			}
			if(rightP < p && mH[rightP] > mH[largest]){
				largest = rightP;
			}
			if(largest != loc){
				swap(loc, largest);
				sinkDown(largest);
			}
	}
	
	public void swap(int l1, int l2){
		int temp = mH[l1];
		mH[l1] = mH[l2];
		mH[l2] = temp;
	}
	
	public void display(){
		int i=1;
		for(; i<size+1; i++){
			System.out.print(mH[i] + "  ");
		}
		System.out.println();
	}
}
