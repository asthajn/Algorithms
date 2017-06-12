package com.heap;

public class MinHeap {
	
	private int size;
	private int p = 1;
	public int[] arr;
	private int[] mH;
	
	public MinHeap(){
		
	}
	public MinHeap(int size){
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
		int pos = p;
		while(pos>=0 && mH[pos/2] > mH[pos]){
			int y = mH[pos];
			mH[pos]=mH[pos/2];
			mH[pos/2] = y;
			pos = pos/2;
		}
	}
	
	public int extractMin(){
		int min = mH[1];
		mH[1]=mH[p];
		mH[p]=min;
		p--;		
		sinkDown(1);
		return min;
	}
	
	public void sinkDown(int loc){

			int leftP = 2*loc;
			int rightP = leftP+1;
			
			int smallest = loc;
			if(leftP <= p && mH[leftP] < mH[smallest]){
				smallest = leftP;
			}
			if(rightP <= p && mH[rightP] < mH[smallest]){
				smallest = rightP;
			}
			if(smallest != loc){
				swap(loc, smallest);
				sinkDown(smallest);
			}
	}
	
	public void sort(){
		int min = mH[1];
		mH[1] = mH[p];
		mH[p] = min;
		p--;
		
		heapify(1, p);
		display();
	}
	
	public void heapify(int loc, int pos){
		int leftP = 2*loc;
		int rightP = leftP+1;
		
		int smallest = loc;
		if(leftP <= pos && mH[leftP] < mH[smallest]){
			smallest = leftP;
		}
		if(rightP <= pos && mH[rightP] < mH[smallest]){
			smallest = rightP;
		}
		if(smallest != loc){
			swap(loc, smallest);
			//pos--;
			heapify(smallest, pos--);
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
