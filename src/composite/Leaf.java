package composite;

//Ҷ�ڵ����Ҷ�ӽڵ�û���ӽڵ�
public class Leaf extends Component
{
	public Leaf(String name)
	{
		super(name);
	}
	
	@Override
	public void add(Component c) {
		
		System.out.println("cannot add to a leaf");
		
	}

	@Override
	public void remove(Component c) {
		System.out.println("cannot remove from a leaf");
	}
	
	@Override
	public void display(int depth) {
	getDepth(depth);
	System.out.println(name);
		
	}
	
	public void getDepth(int depth)
	{
		for(int i = 0; i <depth; i++)
		{
			System.out.print("-");
		}
	}
}
