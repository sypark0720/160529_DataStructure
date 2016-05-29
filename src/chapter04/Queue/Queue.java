package chapter04.Queue;

public interface Queue<E> {
	public void clear();
	public void enqueue(E it);
	public E dequeue();
	public E frontValue();
	public int length();

}
