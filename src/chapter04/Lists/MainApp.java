package chapter04.Lists;

public class MainApp {

	public static void main(String[] args) {
		ArrayBasedList<Integer> AList = new ArrayBasedList<Integer>(5);
		//System.out.println(AList.currPos());
		AList.insert(10);
		AList.insert(20);
		AList.insert(30);
		AList.insert(40);
		//System.out.println(AList.getListSize());
		AList.next();
		//System.out.println(AList.getCurr());
		AList.remove();
		//System.out.println(AList.getListSize());
		AList.moveToPos(100);
		System.out.println(args[0]);

	}

}
