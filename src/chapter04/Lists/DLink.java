package chapter04.Lists;

public class DLink<E>{
	//Fields
	private E element;
	private DLink<E> next;
	private DLink<E> prev;
	
	//Constructors
	public DLink(E element, DLink<E> next, DLink<E> prev) {
		super();
		this.element = element;
		this.next = next;
		this.prev = prev;
	}

	//Getter&Setter
	public DLink(DLink<E> next, DLink<E> prev) {
		super();
		this.next = next;
		this.prev = prev;
	}

	public E element() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public DLink<E> next() {
		return next;
	}

	public void setNext(DLink<E> next) {
		this.next = next;
	}

	public DLink<E> prev() {
		return prev;
	}

	public void setPrev(DLink<E> prev) {
		this.prev = prev;
	}
}
