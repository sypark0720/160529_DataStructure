package chapter04.Dictionary;

public class KVpair<K, E> {
	private K key;
	private E element;
	
	public KVpair(K key, E element) {
		this.key = key;
		this.element = element;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	
	
}
