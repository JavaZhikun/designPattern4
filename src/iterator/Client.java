package iterator;

public class Client 
{
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		
		a.setItem(0, "����");
		a.setItem(1, "С��");
		a.setItem(2, "����");
		a.setItem(3, "����");
		a.setItem(4, "�����ڲ�Ա��");
		a.setItem(5, "С͵");
		
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		System.out.println(item);
		while(!i.isDone())
		{
			System.out.println(i.currentItem() + "����Ʊ");
			i.next();
		}
		
		System.out.println("-----------------------------���Ƿָ���-------");
		Iterator j = new ConcreteIteratorDesc(a);
		Object item2 = j.first();
		while(!j.isDone())
		{
			System.out.println(j.currentItem() + "����Ʊ");
			j.next();
		}
		
	}

}
