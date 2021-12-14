package collection_framework;

public class AssetTester {
	
	public static void main(String args[]) {
		
		Asset hpAsset=new AssetContainer();
		Book1 book1=new Book1("clean Code","Robert c Martin",867.0,1000);
		Book1 book2=new Book1("Jungle Book","joseph Rudyard",1500.0,150);
		Book1 book3=new Book1(" 5 story pointer","Chethan Bhagath",2000.0,100);
		
		hpAsset.addAsset(book1);
		hpAsset.addAsset(book2);
        hpAsset.updateAsset(book2,"Jungle Raj");		
		hpAsset.searchAsset(book1);
		hpAsset.updateAsset(book1,"Clean code");
		hpAsset.deleteAsset(book1);
		
		hpAsset.listOfAllAssets();
		
	}

}
