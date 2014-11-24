package iterator;

public class ConcreteIteratorDesc extends Iterator
{
	public ConcreteAggregate aggregate;//定义了一个具体的聚集对象
	public int current = 0;
	
	public ConcreteIteratorDesc(ConcreteAggregate aggregate)
	{
		this.aggregate = aggregate;
		current = aggregate.count() - 1;
	}
	
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.items.get(aggregate.count() -1);
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret = null;
		current--;
		if(current >= 0)
		{
			ret = aggregate.items.get(current);
		}
		
		return ret;
		
	}
	
	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregate.items.get(current);
	}
	
	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current < 0 ?true : false;
	}

}
