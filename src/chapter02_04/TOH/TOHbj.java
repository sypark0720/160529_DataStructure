package chapter02_04.TOH;

import java.util.Stack;

public class TOHbj {
	 public operation op;
	 public int num;
	 public int start, goal, temp;
	 
	 TOHobj(operation o, int n, Pole s, Pole g, Pole t){
		 op = o;
		 num = n;
		 start = s;
		 goal = g;
		 temp t;
	 }
	 
	 TOHobj(operationo, Pole s, Pole g)
	 {op = o; start = s; goal = g;}
	 
	 static void TOH(int n, int start, int goal, int temp){
		 Stack<TOHobj> S = new Stack<TOHobj>(2*n+1);
		 S.push(new TOHobj(operation.TOH, n, start, goal, temp));
		 
	 }
	 
	 
}
