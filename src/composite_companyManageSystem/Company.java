package composite_companyManageSystem;

public abstract class Company {
	public String name;
	public Company(String name)
	{
		this.name = name;
	}
	
	public abstract void add(Company c);//����
	public abstract void remove(Company c);//�Ƴ�
	public abstract void display(int depth);//��ʾ
	public abstract void lineOfDuty();//����ְ��

}
