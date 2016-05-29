package chapter05.BinaryTrees;

public class BSTNode<Key, E> implements BinNode<E> {
	
	//field
	private Key key; //key for this node
	private E element;	
	private BSTNode<Key, E> left;	//pointer to left child
	private BSTNode<Key, E> right;  //pointer to right child
	
	//Constructors
	public BSTNode(){
		left = right = null;
	}
	
	
	public BSTNode(Key key, E element) {
		this.key = key;
		this.element = element;
		left = right = null;
	}
	
	public BSTNode(Key key, E element, BSTNode<Key, E> left, BSTNode<Key, E> right) {
		this.key = key;
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	//methods	
	public Key key(){return key;}
	public void setKey(Key k){this.key = k; return;}
	
	
	@Override
	public E element() { return element;}
	@Override
	public void setElement(E v) { this.element = v;	return;}
	
	
	@Override
	public BinNode<E> left() { return this.left; }
	public void setLeft(BSTNode<Key, E> v) { this.left = v;	return;}
	
	@Override
	public BinNode<E> right() {return this.right();	}
	public void setRight(BSTNode<Key, E> v) { this.right = v;	return;}
	
	@Override
	public boolean isLeaf() {
		return (left == null)&&(right == null); 
	}
}
