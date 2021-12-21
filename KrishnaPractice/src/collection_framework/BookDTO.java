package collection_framework;

public class BookDTO {
	
	private String name;
	private String authorName;
	private double price;
	private int noOfPages;
	
	
	public BookDTO(String name, String authorName, double price, int noOfPages) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.price = price;
		this.noOfPages = noOfPages;
	}
	
	
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getNoOfPagges() {
		return noOfPages;
	}


	public void setNoOfPagges(int noOfPagges) {
		this.noOfPages = noOfPagges;
	}

	

	@Override
	public String toString() {
		return "Book1 [name=" + name + ", authorName=" + authorName + ", price=" + price + ", noOfPages=" + noOfPages
				+ "]";
	}



}
