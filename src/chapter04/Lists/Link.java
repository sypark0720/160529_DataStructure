package chapter04.Lists;

public class Link<E> {
	
	//field
	private E element;
	private Link<E> next;	//Pointer to next node in list(next�뒗 �떎�쓬 node 洹� �옄泥�!)
	
	//Constructors
	public Link(E element, Link<E> next) {
		this.element = element;
		this.next = next;
	}

	public Link(Link<E> next) {
		this.next = next;
	}
	
	
	//methods
	public Link<E> next(){
		return next;
	}
	
	public Link<E> setNext(Link<E> nextval){
		next = nextval;
		return next;
	}
	
	public E element(){
		return element;
	}
	
	public E setElement(E elementval){
		return element=elementval;
	}
}
