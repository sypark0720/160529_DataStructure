package chapter04.Lists;

public class DoublyLinkedList<E> implements List<E> {
	
	//Fields
	private DLink<E> head;
	private DLink<E> curr;
	private DLink<E> tail;
	private int cnt;
	
	//Constructors
	public DoublyLinkedList() {
		head = curr = tail = new DLink<E>(null, null);
		cnt = 0;
	}
	
	
	//Methods
	@Override
	public void clear() {
		head = curr = tail = new DLink<E>(null, null);
		cnt = 0;
		
	}

	@Override
	public void insert(E item) {
		DLink<E> temp = new DLink<E>(item, curr, curr.next());
		curr.setNext(temp);
		curr.next().next().setPrev(temp);
		
		if(curr == tail){
			tail = temp;
		}
		cnt++;
		
	}

	@Override
	public void append(E item) {
		tail.setPrev(new DLink<E>(item, tail.prev(), tail));
		tail.prev().prev().setNext(tail.prev());
		cnt++;
	}

	@Override
	public E remove() {
		if (curr.next() == null) return null;	
		E removedNode = curr.next().element();
		if(curr.next() == tail) tail = curr;
		DLink<E> temp = curr.next().next();
		curr.setNext(temp);
		curr.next().next().setPrev(curr);

		cnt--;
		return removedNode;
	}

	@Override
	public void moveToStart() {
		curr = head;
		
	}

	@Override
	public void moveToEnd() {
		curr = tail;
		
	}

	@Override
	public void prev() {
		if(curr !=head )
		curr = curr.prev();
	}

	@Override
	public void next() {
		if(curr != tail )
		curr = curr.next();
		
	}

	@Override
	public int length() {
		return cnt;
	}

	@Override
	public int currPos() {
		DLink<E> temp = head;
		int i;
		for(i=0; temp != curr; i++)
			temp = temp.next();
		return i;
	}

	@Override
	public void moveToPos(int pos) {
		assert (pos>=0) && (pos<=cnt) : "Pos out of range";
		curr = head;
		for(int i=0; i<pos; i++) curr = curr.next();
	}

	@Override
	public E getValue() {
		if (curr.next()==null) return null;
		return curr.next().element();
	}

}
