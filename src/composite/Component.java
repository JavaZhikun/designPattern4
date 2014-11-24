package composite;


//组合中的对象申明接口
public abstract class Component 
{

	public String name;
	
	public Component(String name)
	{
		this.name = name;
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}
