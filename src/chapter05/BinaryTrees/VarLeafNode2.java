package chapter05.BinaryTrees;

public class VarLeafNode2 implements VarBinNode2 {
	//field
	private String operand;
	
	//constructor
	public VarLeafNode2(String operand) {
		this.operand = operand;
	}
	
	//methods
	@Override
	public boolean isLeaf() {return true;}
	@Override
	public void traverse() { System.out.println(operand); }//visit 처리를 해주어야 한다.
	}


