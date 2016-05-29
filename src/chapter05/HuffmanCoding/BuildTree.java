package chapter05.HuffmanCoding;

public class BuildTree {

	public static void main(String[] args) {

	}
	
	static HuffTree<Character> buildTree(){
		HuffTree tmp1, tmp2, tmp3 = null;
		
		while(Hheap.heapsize()>1){ //while two items left                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			tmp1=Hheap.removein();
			tmp2=Hheap.removein();
			tmp3 = new HuffTree<Character>(tmp1.root(), tmp2.root(), tmp1.weight()+tmp2.weight());
			Hheap.insert(tmp3);
			return tmp3;
		}
	}
	return tmp3;
}
