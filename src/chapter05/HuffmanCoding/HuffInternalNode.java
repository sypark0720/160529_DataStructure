package chapter05.HuffmanCoding;

public class HuffInternalNode<E> implements HuffBaseNode<E> {
	private int weight;
	private HuffBaseNode<E> left; //pointer to left child
	private HuffBaseNode<E> right; //pointer to right child

	//Constructor
	public HuffInternalNode(int weight, HuffBaseNode<E> left,
			HuffBaseNode<E> right) {
		this.weight = weight;
		this.left = left;
		this.right = right;
	}

	//Getters
	public int weight() {
		return weight;
	}

	public HuffBaseNode<E> left() {
		return left;
	}

	public HuffBaseNode<E> right() {
		return right;
	}
	
	//Methods
	public boolean isLeaf() {return false;}	
	
}
