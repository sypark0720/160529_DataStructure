package chapter02_04.TOH;

public class TOH {

	public static void main(String[] args) {
		
	}
	
	/** 
	 * @param n : the number of disks
	 * @param start : the start pole
	 * @param goal : the goal pole
	 * @param temp : the other pole
	 */
	
	static void TOH(int n, int start, int goal, int temp){
		if(n ==0) return;
		TOH(n-1, start, temp, goal);
		move(start, goal);
		TOH(n-1, temp, goal, start);
		
	}
	

}
