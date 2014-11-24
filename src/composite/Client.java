package composite;

public class Client 
{
	public static void main(String[] args) {
		
		//��������root�����ϳ�����Ҷ��leafA�� leafB
		Composite root = new Composite("root");
		
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("leaf B"));
		
		
		//���ϳ�����֦composite X����֦����Ҳ����Ҷ��LeafXA,LeafXB
		Composite comp = new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		
		
		//Composite X�����ٳ�����֦compositeXY�� ��֦����Ҳ����Ҷ��Leaf XYA,Leaf XYB
		Composite comp2 = new Composite("Composite XY");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		
		comp.add(comp2);
		
		root.add(new Leaf("Leaf c"));
		
		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		
		root.display(1);
		
		
		
		
	}

}
