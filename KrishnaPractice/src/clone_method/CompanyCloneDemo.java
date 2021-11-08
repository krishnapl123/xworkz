package clone_method;

public class CompanyCloneDemo {

	public static void main(String args[]) throws CloneNotSupportedException {
		
		Company company=new Company();
		Company copiedCompany=(Company) company.clone();
		
		
		System.out.println("Company object");
		company.name="jk";
		System.out.println("Company Name:"+company.name);
		
	company.employee.name="krish";
		System.out.println("Company Employee name:"+company.employee.name);
		System.out.println("Company Employee id:"+company.employee.id);
		
		System.out.println("Copied Company object");
		
		System.out.println("ompany Name:"+copiedCompany.name);
		System.out.println("Company Employee name:"+copiedCompany.employee.name);
		System.out.println("Company Employee id:"+copiedCompany.employee.id);
		
		
	}
}
