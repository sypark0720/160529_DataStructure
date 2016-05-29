package chapter04.Stacks;

import chapter04.Lists.Link;

public class LStack<E> implements Stack<E> {
	//Fields
	private Link<E> top; 	//index for top Object
	private int size;
	
	//Constructors
	public LStack(){top = null; size = 0;}

	@Override
	public void clear() {
		top = null; size = 0;		
	}

	@Override
	public void push(E it) {
		top = new Link<E>(it, top);
		size++;
		
		
	}

	@Override
	public E pop() {
		if (top == null) System.out.println("null");
		E it = top.element();
		top = top.next();
		size--;
		return it;
	}

	@Override
	public E topValue() {
		if (top == null) System.out.println("null");
		return top.element();
	}

	@Override
	public int length() {
		return size;
	}

}
