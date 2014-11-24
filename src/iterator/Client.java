package iterator;

public class Client 
{
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		
		a.setItem(0, "大鸟");
		a.setItem(1, "小菜");
		a.setItem(2, "行李");
		a.setItem(3, "老外");
		a.setItem(4, "公交内部员工");
		a.setItem(5, "小偷");
		
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		System.out.println(item);
		while(!i.isDone())
		{
			System.out.println(i.currentItem() + "请买车票");
			i.next();
		}
		
		System.out.println("-----------------------------我是分割线-------");
		Iterator j = new ConcreteIteratorDesc(a);
		Object item2 = j.first();
		while(!j.isDone())
		{
			System.out.println(j.currentItem() + "请买车票");
			j.next();
		}
		
	}

}
