package chapter05.BinaryTrees;

public class VarIntlNode implements VarBinNode {
	//fields
	private VarBinNode left;
	private VarBinNode right;
	private  Character operator;
	
	//constructors
	public VarIntlNode(Character operator, VarBinNode left, VarBinNode right ) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}
	
	//methods
	@Override
	public boolean isLeaf() {
		return false;
	}
	
	public VarBinNode leftchild() { return left;}
	public VarBinNode rightchild() {return right;}
	public Character value() {return operator;}
	
	public static void traverse(VarBinNode rt){
		if (rt == null) {return ;}
		if (rt.isLeaf())
			System.out.println(((VarLeafNode)rt).value());
		else{
			System.out.println(((VarIntlNode)rt).value());
			traverse(((VarIntlNode)rt).leftchild());
			traverse(((VarIntlNode)rt).rightchild());
		}
	}

}
