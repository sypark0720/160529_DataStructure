package chapter06.NonBinaryTree;

public class ParPtrTree {
	private Integer[] array;
	
	//Constructor
	public ParPtrTree(int size){
		array = new Integer[size];
		for(int i=0; i<size; i++){
			array[i] = null;
		}
	}
	
	public boolean differ(int a, int b){
		Integer root1 = FIND(a);
		Integer root2 = FIND(b);
		return root1 != root2;
	}
	
	public void UNION(int a, int b){
		Integer root1 = FIND(a);
		Integer root2 = FIND(b);
		if (root1 != root2) array[root2] = root1;
	}
	
	//return the root of curr's tree
	public Integer FIND(Integer curr){
		if(array[curr] == null) return curr;
		while(array != null) curr = array[curr];
		return curr;
	}   
	
	//Path compression
//	public Integer FIND(Integer curr){
//		if(array[curr] == null) return curr;	//At root
//		array[curr] = FIND(array[curr]);
//		return curr;
//	}   
	
	
}
