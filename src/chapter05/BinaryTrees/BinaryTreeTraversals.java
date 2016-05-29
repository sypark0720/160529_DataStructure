package chapter05.BinaryTrees;

public class BinaryTreeTraversals {
	//Visit parent nodes before child nodes
	void preorder(BinNode rt){
		if(rt == null){
			return;
		}
		System.out.println(rt); //visit rt
		preorder(rt.left());
		preorder(rt.right());
		
	}
	
	void preorder2(BinNode rt){
		System.out.println(rt);
		if(rt.left()!=null) preorder2(rt.left());
		if(rt.right()!=null)preorder2(rt.right());
	}
	//inferior:
	//1. null 체크가 복잡하다. 
	//2. error prone -> original tree가 비어있다면 initial call에도 실패한다.
	
	//count the number of nodes
	int count(BinNode rt){
		if (rt == null) return 0;
		return count(rt.left())+count(rt.right())+1;
	}
	
	//what range of values is legal for a given node
	boolean checkBST(BinNode<Integer> rt, int low, int high){
		if(rt == null) return true;
		int rootkey = rt.element();
		if((rootkey < low || rootkey > high)) return false;
		if (!checkBST(rt.left(), low, rootkey)) return false;
		return checkBST(rt.right(), rootkey, high);		
	}
}
