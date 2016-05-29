package chapter05.BinaryTrees;

public interface BinNode<E> {
	//Get&Set element
	public E element();
	public void setElement(E v);
	
	//return the left&right child
	public BinNode<E> left();
	public BinNode<E> right();
	
	//return true|false isLeaf?
	public boolean isLeaf();	
}
