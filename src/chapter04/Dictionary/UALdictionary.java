package chapter04.Dictionary;

import chapter04.Lists.AList;


public class UALdictionary<Key, E> implements Dictionary<Key, E> {
	
	private static final int defaultSize = 10;
	private AList<KVpair<Key,E>> list;
	
	//Constructors
	public UALdictionary(){ this(defaultSize); }
	public UALdictionary(int sz) {
		list = new AList<KVpair<Key,E>>(sz); }
	
	//Methods
	@Override
	public void clear() {
		list.clear();		
	}

	@Override
	public void insert(Key k, E e) {
		KVpair<Key, E> temp = new KVpair<Key, E>(k,e);
		list.append(temp);		
	}

	@Override
	public E remove(Key k) {
		E temp = find(k);
		if(temp != null) list.remove();
		return temp;		
	}

	@Override
	public E removeAny() {
		if(size() != 0){
			list.moveToEnd();
			list.prev();
			KVpair<Key, E> e = list.remove();
			return e.getElement();
		}
		else return null;
	}

	@Override
	public E find(Key k) {
		for(list.moveToStart(); list.currPos() <list.length() ; list.next()){
			KVpair<Key,E> temp = list.getValue();
			if(k==temp.getKey()) return temp.getElement();
		}
		return null;
	}

	@Override
	public int size() {
		return list.length();
	}

}
