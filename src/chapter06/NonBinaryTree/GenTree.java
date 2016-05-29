package chapter06.NonBinaryTree;

/** General tree ADT*/
public interface GenTree<E> {
	public void clear();
	public GTNode<E> root();
	public void newroot(E value, GTNode<E> first, GTNode<E> sib);
	public void newleftchild(E value);
}
