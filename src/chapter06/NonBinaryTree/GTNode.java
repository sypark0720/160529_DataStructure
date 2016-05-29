package chapter06.NonBinaryTree;


//General Tree node ADT
public interface GTNode<E> {
	public E value();
	public boolean isLeaf();
	public GTNode<E> parent();
	public GTNode<E> leftmostChild();
	public GTNode<E> rightSibling();
	public void setValue(E value);
	public void setParent(GTNode<E> par);
	public void insertFirst(GTNode<E> n);
	public void insertNext(GTNode<E> n);
	public void removeFirst();
	public void removeNext();
	
}
