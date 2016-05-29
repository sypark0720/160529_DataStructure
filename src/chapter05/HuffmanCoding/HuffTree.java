package chapter05.HuffmanCoding;

public class HuffTree<E> implements Comparable<HuffTree<E>> {
	private HuffBaseNode<E> root;
	
	//Constructors
	public HuffTree(E element, int weight){
		root = new HuffLeafNode<E>(element, weight);
	}
	public HuffTree(int weight, HuffBaseNode<E> left, HuffBaseNode<E> right){
		root = new HuffInternalNode<E>(weight, left, right);
	}
	
	//Getters
	public HuffBaseNode<E> root(){return root;}
	public int weight(){//weight of tree is weight of root
		return root.weight();
	}
	public int compareTo(HuffTree<E> that){
		if(root.weight()<that.weight()) return -1;
		else if(root.weight()==that.weight()) return 0;
		else return 1;
	}
	
}
