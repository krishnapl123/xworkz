package collection_framework.collections_Problem_Statements;

public class ItemType {
	
	private String name;
	private double deposit;
	private double costperDay;
	
	
	public ItemType() {
		super();
		
	}


	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20s%\n", name, deposit, costperDay);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public double getCostperDay() {
		return costperDay;
	}


	public void setCostperDay(double costperDay) {
		this.costperDay = costperDay;
	}


	public ItemType(String name, double deposit, double costperDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costperDay = costperDay;
	}
	
	

}
