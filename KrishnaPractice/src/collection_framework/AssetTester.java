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
		
		Software software1=new Software("Porter",12.1,true,true);
		
		hpAsset.addAsset(software1);
		
        Software software2=new Software("DigiLocker",13.1,true,true);
		
		hpAsset.addAsset(software2);
		
        Software software3=new Software("jioMart",14.1,true,true);
		
		hpAsset.addAsset(software3);
		
		hpAsset.listOfAllAssets();
		
		
		
		
		
	}

}
