package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate
{
	public List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
       return new ConcreteIterator(this);
	}

	//该聚集类总共有多少个元素
	public int count()
	{
		return items.size();
	}
	
	public Object getItem(int index)
	{
		return items.get(index);
	}
	
	public void setItem(int index,Object value)
	{
		items.add(index, value);
	}

	

	
    
		
			
	
	
}
