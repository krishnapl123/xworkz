package collection_framework;

public interface Asset {
	
	
	
	void addAsset(Object object);
	
    boolean searchAsset(Object object);
	
	void updateAsset(Object object,String newName);
	
	void deleteAsset(Object object);
	
	void listOfAllAssets();
	
	void removeLastAsset();
	
	void removeFirstAsset();
	
	void getFirstAsset();
	
	void getLastAsset();
	
	void addFirstAsset(Object object);
	
	void addLastAsset(Object object);



}
