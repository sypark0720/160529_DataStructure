package chapter04.Lists;

public class FLink<E> {
	//field
	private E element;
	private FLink<E> next;

	//Constructors
	public FLink(E element, FLink<E> next) {
		this.element = element;
		this.next = next;
	}

	public FLink(FLink<E> next) {
		this.next = next;
	}
	
	//Freelist
	static FLink freelist = null;
	
	//앞의 freelist부터 쓴다.
	static <E> FLink<E> get(E it, FLink<E> nextval){
		if (freelist == null) return new FLink<E>(it, nextval);
		FLink<E> temp = freelist;
		freelist = freelist.next;
		temp.setElement(it);
		temp.setNext(nextval);
		return temp;
	}
	
	//새 링크를 앞쪽으로 삽입
	void release(){
		element = null;
		next = freelist;
		freelist =this;
	}

	//Getter&Setter
	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public FLink<E> getNext() {
		return next;
	}

	public void setNext(FLink<E> next) {
		this.next = next;
	}
	

	
	
}
