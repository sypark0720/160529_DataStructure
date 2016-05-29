package chapter05.BinaryTrees;

public class VarLeafNode implements VarBinNode {
	//field
	private String operand;
	
	//Constructors
	public VarLeafNode(String val){ operand = val; }
	
	//methods
	@Override
	public boolean isLeaf() {
		return true;
	}
	public String value(){ return operand;}

}
