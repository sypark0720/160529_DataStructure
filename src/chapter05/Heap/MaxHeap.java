package chapter05.Heap;

public class MaxHeap<E extends Comparable<? super E>> {
	private E[] Heap; //Pointer to the Heap array
	private int size;
	private int n; //Number of things in heap
	
	//Constructor
	public MaxHeap(E[] h, int num, int max){
		Heap = h;
		n= num;
		size = max;
		buildheap();
	}
	
	public int heapsize() {
		return n;
	}
	
	public boolean isLeaf(int pos){
		return (pos >= n/2)&&(pos<n);
	}
	
	public int leftchild(int pos){//return position for left child of pos
		assert pos<n/2:"Position has no left child";
		return 2*pos +1;
	}
	
	public int rightchild(int pos){//return position for left child of pos
		assert pos<(n-1)/2:"Position has no right child";
		return 2*pos +2;
	}
	
	public void insert(E val){
		assert n<size: "Heap is full";
		int curr = n++;
		Heap[curr] = val; //일단 맨 끝에 넣는다.
		
		while((curr != 0)&&Heap[curr].compareTo(Heap[parent(curr)]>0)){
			DSutil.swap(Heap, curr, parent(curr));
			curr = parent(curr);
		}
	}
	//Heapify contents of Heap
	public void buildheap(){
		for (int i = n/2-1; i>=0; i--)
			siftdown(i);
	}
	
	//Put element in its correct place
	private void siftdown(int pos){
		assert (pos>=0) && (pos<n): "Illegal heap position";
		while(!isLeaf(pos)){ //pos가 leaf가 아닐 때
			int j = leftchild(pos);
			if((j<n-1)&&(Heap[j].compareTo(Heap[j+1])<0)) j++; //j is now index of child with greater value(두 child중에)
			if(Heap[pos].compareTo(Heap[j])>=0) return;
			DSutil.swap(Heap, pos, j);
			pos = j; //move down			
		}
	}
	
	public E removemax(){
		assert n>0:"Removing from empty heap";
		DSutil.swap(Heap, 0, --n); //swap maximum with last value
		if(n!=0) siftdown(0);
		return Heap[n];
	}
	
	public E remove(int pos){
		assert (pos>=0)&&(pos<n): "IIllegal heap position";
		if(pos == (n-1)) n--; //last element, no work to be done
		else{
			DSSutil.swap(Heap, pos, --n) //swap with last value
			//last value가 pos에 들어감!
			//pos의 값이 크면 swap it up
			while((pos>0)&&(Heap[pos].compareTo(Heap[parent(pos)])>0)){
				DSutil.swap(Heap, pos, parent(pos));
				pos = parent(pos);
				}			
			//작으면 push down
			if(n!=0) siftdown(pos);
			}
		return Heap[n];
	}
}
