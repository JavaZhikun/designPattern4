package composite_companyManageSystem;

public class Client 
{
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܹ�˾����"));
		
		ConcreteCompany comp = new ConcreteCompany("�Ϻ������ֹ�˾");
		comp.add(new HRDepartment("�����ֹ�˾������Դ��"));
		comp.add(new FinanceDepartment("�����ֹ�˾����"));
		root.add(comp);
		
		ConcreteCompany comp1 = new ConcreteCompany("�Ͼ����´�");
		comp1.add(new HRDepartment("�Ͼ����´�������Դ��"));
		comp1.add(new FinanceDepartment("�Ͼ����´�����"));
		comp.add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("���ݰ��´�");
		comp2.add(new HRDepartment("���ݰ��´�������Դ��"));
		comp2.add(new FinanceDepartment("���ݰ��´�����"));
		comp.add(comp2);
		
		System.out.println("�ṹͼ");
		root.display(1);
		
		System.out.println("ְ��");
		root.lineOfDuty();
	}

}
