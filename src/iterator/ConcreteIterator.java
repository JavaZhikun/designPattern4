package iterator;

public class ConcreteIterator extends Iterator
{
	public ConcreteAggregate aggregate;
	public int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		// TODO Auto-generated constructor stub
		this.aggregate = aggregate;
	}
	
	@Override
	public Object first() {
		// TODO Auto-generated method stub
	   return aggregate.items.get(0);
	}

    //得到聚集的下一个对象
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret = null;
		current++;
		if(current < aggregate.items.size())
		{
			ret =aggregate.items.get(current);
		}
		return ret;
	}
	
	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current >= aggregate.items.size() ?true : false;
	}
	
	
	//返回当前的聚集对象
	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregate.items.get(current);
	}
}
