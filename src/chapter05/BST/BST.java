package chapter05.BST;

import chapter04.Dictionary.Dictionary;
import chapter05.BinaryTrees.BSTNode;

public class BST<Key extends Comparable<? super Key>, E> implements Dictionary<Key, E> {
	private BSTNode<Key, E> root;
	private int nodecount;

	@Override
	public void clear() {
		root = null;
		nodecount = 0;
	}
	
	private BSTNode<Key, E> inserthelp(BSTNode<Key, E> rt, Key k, E e){
		if (rt == null) return new BSTNode<Key, E>(k, e);
		if (rt.key().compareTo(k) >0) rt.setLeft(inserthelp((BSTNode<Key, E>) rt.left(), k, e));
		else rt.setRight(inserthelp((BSTNode<Key, E>) rt.right(), k, e));
		return rt;
	}
	
	
	@Override
	public void insert(Key k, E e) {
		root = inserthelp(root, k, e);
		nodecount++;
		
	}
	
	private BSTNode<Key, E> deletemin(BSTNode<Key, E> rt){
		if(rt.left()==null) return (BSTNode<Key, E>) rt.right();
		rt.setLeft(deletemin((BSTNode<Key, E>) rt.left()));
		return rt;
	}
	
	private BSTNode<Key, E> getmin(BSTNode<Key, E> rt){
		if(rt.left() == null ) return rt;
		return getmin((BSTNode<Key, E>) rt.left());
	}

	private BSTNode<Key, E> removehelp(BSTNode<Key, E> rt, Key k){
		if (rt == null) return null;
		if (rt.key().compareTo(k)>0) rt.setLeft(removehelp((BSTNode<Key, E>) rt.left(),k));
		else if (rt.key().compareTo(k)<0) rt.setRight(removehelp((BSTNode<Key, E>) rt.right(),k));
		else{
			if(rt.left() == null) return (BSTNode<Key, E>) rt.right();
			else { //two children
				BSTNode<Key, E> temp = getmin((BSTNode<Key, E>) rt.right());
				rt.setKey(temp.key());
				rt.setRight(deletemin((BSTNode<Key, E>) rt.right()));
			}
		}
		return rt;		
	}
	@Override
	public E remove(Key k) {
		E temp = findhelp(root, k);
		if(temp != null){
			root = removehelp(root,k);
			nodecount--;
		}
		return temp;
	}

	@Override
	public E removeAny() {
		if (root == null) return null;
		E temp = root.element();
		root = removehelp(root, root.key());
		nodecount--;
		return temp;
	}
	
	private E findhelp(BSTNode<Key, E> rt, Key k) {
		if(rt == null) return null;
		if( rt.key().compareTo(k) >0 ) return findhelp((BSTNode<Key, E>) rt.left(), k);
		else if(rt.key().compareTo(k) ==0) return rt.element();
		else return findhelp((BSTNode<Key, E>) rt.right(), k);
		
	}

	@Override
	public E find(Key k) {
		return findhelp(root, k);
	}

	@Override
	public int size() {
		return nodecount;
	}
	
	private void printhelp(BSTNode<Key, E> rt){
		if (rt == null) return;
		printhelp((BSTNode<Key, E>) rt.left());
		//printVisit(rt.element());
		printhelp((BSTNode<Key, E>) rt.right());
	}

}
