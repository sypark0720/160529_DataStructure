package chapter04.Lists;

public class LinkedList<E> implements List<E> {
	
	//field
	private Link<E> head;
	private Link<E> curr;
	private Link<E> tail;
	private int size;
	
	//constructors
	public LinkedList(int size) {
		this(); //뒤의 constructor로 넘긴다. size는 무시
	}
	public LinkedList() {
		curr=head=tail=new Link<E>(null);
		size = 0;
	}
	
	//methods
	@Override
	public void clear() {
		curr=head=tail=new Link<E>(null);
		size = 0;
	}

	@Override
	public void insert(E item) {
		Link<E> newNode = new Link<E>(item, curr.next());
		curr.setNext(newNode);           
		
		if (tail==curr)tail = curr.next(); //tail = newNode;도 됨.		
		size++;		
	}

	@Override
	public void append(E item) {
		Link<E> newNode = new Link<E>(item, null);
		tail.setNext(newNode);		
		tail = newNode; //--> tail = tail.setNext(new Link<E>(item,null));
		size++;		
	}

	@Override
	public E remove() {
		if (curr.next() == null) return null;
		
		//삭제되는 item리턴
		E removedNode = curr.next().element();
		
		//tail이 삭제되면 tail이 바뀐다.
		if(curr.next() == tail) tail = curr;
		
		//삭제하기
		Link<E> temp = curr.next().next();
		curr.setNext(temp);
		
		size--;
		return removedNode;
	}

	@Override
	public void moveToStart() {
		curr=head;		
	}

	@Override
	public void moveToEnd() {
		curr = tail;		
	}

	@Override
	public void prev() {//move curr one step left
		if (curr!=head){
		Link<E> temp = head;
		while (temp.next()!= curr){
			temp = temp.next();
		}
		curr = temp;
		}
	}

	@Override
	public void next() {//move curr one step right
		if(curr != tail) curr = curr.next();
		return;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public int currPos() {
		Link<E> temp = head;
		int i;
		for (i=0; curr != temp; i++)
			temp = temp.next();
		return i;
	}

	@Override
	public void moveToPos(int pos) {
		assert (pos>=0) && (pos<=size) : "Pos out of range";
		curr = head;
		for(int i=0; i<pos; i++) curr = curr.next();
	}

	@Override
	public E getValue() {
		if (curr.next()==null) return null;
		return curr.next().element();
	}

}
