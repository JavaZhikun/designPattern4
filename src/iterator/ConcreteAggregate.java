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

	//�þۼ����ܹ��ж��ٸ�Ԫ��
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
