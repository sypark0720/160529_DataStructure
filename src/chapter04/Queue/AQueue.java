package chapter04.Queue;

public class AQueue<E> implements Queue<E> {
	
	private static final int defaultSize = 10;
	private int maxSize;
	private int front;
	private int rear; //µÚÂÊ
	private E[] listArray;
	
	//Constructors
	AQueue(){ this(defaultSize); }
	AQueue(int size){ 
		maxSize = size+1; // one extra size is allocated
		rear = 0;
		front = 1;
		listArray = (E[]) new Object[maxSize];
		}
	

	@Override
	public void clear() {
		rear = 0;
		front = 1;
	}

	@Override
	public void enqueue(E it) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E frontValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
