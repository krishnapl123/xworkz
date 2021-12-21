package collection_framework;

public class AssetDTOTester {

	public static void main(String args[]) {
		
		Asset assetdto=new AssetImple();
		
		BookDTO bookdto1=new BookDTO("clean Code1","Robert c Martin",867.0,1000);
		
		BookDTO bookdto2=new BookDTO("clean Code2","Robert c Martin",867.0,1000);
		
		BookDTO bookdto3=new BookDTO("clean Code3","Robert c Martin",867.0,1000);
		
	     assetdto.addFirstAsset(bookdto1);
	    
	     assetdto.getFirstAsset();
	     assetdto.addLastAsset(bookdto3);
	     assetdto.getLastAsset();
	     assetdto.removeFirstAsset();
	     assetdto.listOfAllAssets();
	     assetdto.removeLastAsset();
	     assetdto.getFirstAsset();
	     
	     
	     
	      
	}
}
