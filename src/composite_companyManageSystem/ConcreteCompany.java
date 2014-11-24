package composite_companyManageSystem;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company
{
	public List<Company> children = new ArrayList<Company>();
	
	public ConcreteCompany(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}
	
	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
	  children.remove(c);	
	}
	
	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		getDepth(depth);
		System.out.println(name);
		
		for(Company component: children)
		{
			component.display(depth + 2);
		}
	}
	
	public void getDepth(int depth)
	{
		for(int i = 0; i < depth; i++)
		{
			System.out.print("-");
		}
	}
	
	//ÂÄÐÐÖ°Ôð
	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		
		for(Company component : children)
		{
	         component.lineOfDuty();
		}
	}
	
	

}
