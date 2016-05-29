package chapter04.Queue;

import chapter04.Lists.Link;

public class LQueue<E> implements Queue<E> {
	private static final int defaultSize = 10;
	private int size;
	private Link<E> front;
	private Link<E> rear;

	
	//Constructors
	LQueue(){init();}
	LQueue(int size){
		init();
	}
	
	//Methods
	private void init(){
		front = rear = new Link<E>(null);
		size = 0;	
	}
	
	@Override
	public void clear() {
		init();		
	}
	@Override
	public void enqueue(E it) {
		rear.setNext(new Link<E>(it, null));
		rear = rear.next();
		size++;
		
	}
	@Override
	public E dequeue() {
		assert size!=0:"Queue is empty";
		E it = front.next().element();
		front.setNext(front.next().next());
		if(front.next()==null) rear = front; //Last Object
		size--;
		return it;
		
	}
	@Override
	public E frontValue() {
		assert size!=0:"Queue is empty";
		return front.next().element();
	}
	@Override
	public int length() {
		return size;
	}
	

}
