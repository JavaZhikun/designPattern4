package composite;

import java.util.ArrayList;
import java.util.List;

//定义枝节点行为，用来存储子部件
public class Composite extends Component
{
	public List<Component> children = new ArrayList<Component>();
	
	public Composite(String name)
	{
		super(name);
	}
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
	   children.remove(c);	
	}
	
	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		getDepth(depth);
		System.out.println(name);
		
		for(Component component:children)
		{
			component.display(depth + 2);
		}
	}
		
		public void getDepth(int depth)
		{
			for(int i = 0; i <depth; i++)
			{
				System.out.print("-");
			}
		}
}
