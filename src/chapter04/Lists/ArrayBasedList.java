package chapter04.Lists;

public class ArrayBasedList<E> implements List<E> {
	//field
	private static final int defaultSize = 10;
	private int maxSize;
	private int listSize;
	private int curr;
	private E[] listArray;

	//constructors
	@SuppressWarnings("unchecked")
	public ArrayBasedList(int maxSize) {
		this.maxSize = maxSize;
		this.listSize =0;
		this.curr =0;
		listArray = (E[])new Object[maxSize];
	}
	public ArrayBasedList() {
		this(defaultSize);
	}
	
	//methods
	
	@Override
	public void clear() {
		listSize = 0;
		curr=0;		
	}

	@Override
	public void insert(E item) {
		assert listSize < maxSize : "List capacity exceeded"; 
			for(int i = listSize; i>curr; i--)
				listArray[i] = listArray[i-1];
		listArray[curr]= item;
		listSize++;
		}

	@Override
	public void append(E item) {
		assert listSize < maxSize : "List capacity exceeded";
		listArray[listSize++] = item;
	}

	@Override
	public E remove() {
		if ((curr<0)||(curr>=listSize))
			return null;
		E item = listArray[curr];
		for(int i = listSize-1 ; i>curr; i--)
			listArray[i-1] = listArray[i];
		listArray[(listSize--)-1]=null;
		return item;
	}

	@Override
	public void moveToStart() {
		curr = 0;
	}

	@Override
	public void moveToEnd() {
		curr = listSize-1;
	}

	@Override
	public void prev() {
		assert curr != 0 : "first position";
		curr--;
	}

	@Override
	public void next() {
		assert curr < listSize: "last position";
		curr++;
	}

	@Override
	public int length() {
		return listSize;
	}

	@Override
	public int currPos() {
		return curr;
	}

	@Override
	public void moveToPos(int pos) {
		assert (pos>=0) && (pos<=listSize) : "Pos out of range";
		curr = pos;
	}
	
	@Override
	public E getValue() {
		assert (curr>=0) && (curr<listSize): "Curr out of range";
		
		return listArray[curr];
	}
	
	//getter&setter
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public int getCurr() {
		return curr;
	}
	public void setCurr(int curr) {
		this.curr = curr;
	}
	public E[] getListArray() {
		return listArray;
	}
	public void setListArray(E[] listArray) {
		this.listArray = listArray;
	}
	public static int getDefaultsize() {
		return defaultSize;
	}	
	
}
