package chapter04.Stacks;

public interface Stack<E> {
	public void clear();
	public void push(E it);
	public E pop();
	public E topValue();
	public int length();
}
