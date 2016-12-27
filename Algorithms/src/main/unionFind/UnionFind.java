package main.unionFind;

public abstract class UnionFind {
	
	protected int[] id;
	
	protected UnionFind (int length){
		id = new int[length];
		
		for (int i = 0; i < length; i++) {
			id[i] = i;
		}
	}
	
	public abstract boolean connected(int a, int b);
	public abstract void unite(int a, int b);

}
