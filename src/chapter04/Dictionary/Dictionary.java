package chapter04.Dictionary;

public interface Dictionary<Key, E> {
	public void clear();
	public void insert(Key k, E e);
	public E remove(Key k);
	public E removeAny();
	public E find(Key k);
	public int size();
}
