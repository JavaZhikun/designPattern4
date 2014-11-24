package composite_companyManageSystem;

public class HRDepartment  extends Company 
{
	public HRDepartment(String name)
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
		System.out.println(name + "员工招聘培训管理");
	}

}
