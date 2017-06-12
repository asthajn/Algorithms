package com.stack;

public class Stack {
	
	private int maxSize;
	private int top = 0;
	private int[] arr;
	
	public Stack(int size){
		this.maxSize = size;
		this.arr = new int[maxSize];
		top = -1;
	}
	public void push(int value){
		if(this.isFull()){
			System.out.println("The stack is full, please pop some elements to push more");
		}else{
			this.top ++;
			arr[top] = value;
		}
	}
	
	public int pop(){
		if(this.isEmpty()){
			System.out.println("Stack is empty nothing to pop");
			return -1;
		}
		return arr[top--];
	}
	
	public int peek(){
		return arr[top];
	}
	
	public boolean isEmpty(){
		return (top == -1)?true : false;
	}
	
	public boolean isFull(){
		return (top == maxSize-1)?true : false;
	}

	public static void main(String[] args) {
		
		Stack myStack = new Stack(5);
		System.out.println("The stack empty status: " + (myStack.isEmpty()? "empty":"not empty"));
		myStack.push(2);
		myStack.push(10);
		myStack.push(4);
		myStack.push(90);
		myStack.push(0);
		myStack.push(34);
		System.out.println("The stack empty status now: " + (myStack.isEmpty()? "empty":"not empty"));
		System.out.println("The stack full status: "+ (myStack.isFull()?"full" : "not full") );
		
		while(!myStack.isEmpty()){
			System.out.println(myStack.pop());
		}
		

	}

}
