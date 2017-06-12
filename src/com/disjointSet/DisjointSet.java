/******************
 * union : theta(1)
 * find: theta(log u) --> worst case first find()
 * union and find ~ close to constant
 *  ----> seq of f find and u union operations (theta(u + f * alpha*(f+u, u))), alpha<4 (always)
 ******************/

package com.disjointSet;

public class DisjointSet {
	
	private int[] arr;
	private int n;
	
	public DisjointSet(int n) {
		this.n = n;
		arr = new int[n];
		makeSet();
	}

	public void makeSet(){
		for(int i=0; i<n; i++){
			arr[i] = -1;
		}
	}
	
	public int find(int x){
		if(arr[x] < 0){
			return x;
		}else{
			arr[x] = find(arr[x]);
			return arr[x];
		}
	}
	
	public void union(int root1, int root2){
		if(arr[root1] < arr[root2]){
			arr[root1] += arr[root2];
			arr[root2] = root1;
		}else{
			arr[root2] += arr[root1];
			arr[root1] = root2;
		}
	}
	
	public static void main(String args[]){
		DisjointSet ds = new DisjointSet(10);
		ds.union(ds.find(1), ds.find(2));
		System.out.println(ds.find(1));
		ds.union(ds.find(2), ds.find(3));
		System.out.println(ds.find(1) + " " +ds.find(2) +" "+ds.find(3) + " "+ds.find(7));
	}

}
