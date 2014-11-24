package composite_companyManageSystem;

public class FinanceDepartment extends Company
{
	public FinanceDepartment(String name)
	{
		super(name);
	}
	
	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		getDepth(depth);
		System.out.println(name);
	}
	
	public void getDepth(int depth)
	{
		for(int i = 0; i < depth; i++)
		{
			System.out.print("-");
		}
	}
	
	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
	   System.out.println(name + "公司财务收支管理");	
	}

}
