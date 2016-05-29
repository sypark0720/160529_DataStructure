package chapter05.HuffmanCoding;

public class HuffLeafNode<E> implements HuffBaseNode<E> {
	
	private E element;
	private int weight;
	
	//Constructor
	public HuffLeafNode(E element, int weight){
		this.element = element;
		this.weight = weight;
	}
	
	//Getters
	public E element() { return element;}
	
	@Override
	public int weight() {return weight;	}
	
	//methods
	@Override
	public boolean isLeaf() { return true;}
}
