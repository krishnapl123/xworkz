package collection_framework.treeSet;

public class Employee implements Comparable<Employee>{
	
	public Employee(int id, String name, double salary, String company, String place) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.company = company;
		this.place = place;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + ", place="
				+ place + "]\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	private int id;
	private String name;
	private double salary;
	private String company;
	private String place;
	
	@Override
	public int compareTo(Employee o) {
		 if(this.id>o.id)
			 return 100;
		 if(this.id<o.id)
			 return -100;
		 if(this.id==o.id)
			 return 0;
		return 0;	
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
