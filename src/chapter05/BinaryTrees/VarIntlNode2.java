package chapter05.BinaryTrees;

public class VarIntlNode2 implements VarBinNode2 {
	//fields
	private VarBinNode2 left;
	private VarBinNode2 right;
	private Character operator;
	
	//Constructors
	public VarIntlNode2(Character operator, VarBinNode2 left, VarBinNode2 right) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}
	
	//Methods
	@Override
	public boolean isLeaf() {return false;}
	public VarBinNode2 leftchild() {return left;}
	public VarBinNode2 rightchild() {return right;}
	public Character operator(){ return operator;}
	@Override
	public void traverse() {
		System.out.println(this.operator);
		if(left!=null) left.traverse();
		if(right!=null) right.traverse();	
	}
	
	//pre-order traversal
	public static void traverse(VarBinNode2 rt){
		if(rt!=null)rt.traverse();
	}
	

}
