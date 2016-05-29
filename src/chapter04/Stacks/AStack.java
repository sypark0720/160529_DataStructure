package chapter04.Stacks;

public class AStack<E> implements Stack<E> {
	//field
	private static final int defaultSize = 10;
	private int maxSize;
	private int top; 	//index for top Object
	private E[] listArray;

	//Constructors
	AStack(){ this(defaultSize);}
	@SuppressWarnings("unchecked")
	AStack(int size){ 
		maxSize = size;
		top = 0;
		listArray = (E[]) new Object[size];		
	}
	
		
	@Override
	public void clear() {
		top = 0;		
	}

	@Override
	public void push(E it) {
		if(top == maxSize) System.out.println("The stack is full");
		listArray[top++] = it;
		
	}

	@Override
	public E pop() {
		if(top == 0) System.out.println("The stack is empty");
		return listArray[--top];
	}

	@Override
	public E topValue() {
		if(top == 0) System.out.println("The stack is empty");
		return listArray[top-1];
	}

	@Override
	public int length() {
		return top;
	}

}
