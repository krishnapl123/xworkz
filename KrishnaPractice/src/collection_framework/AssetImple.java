package collection_framework;

import java.util.*;

public class AssetImple implements Asset{
	
	Collection linkedList=new LinkedList();
	Collection collection=new ArrayList();
	

	

	@Override
	public void removeLastAsset() {
	System.out.println("Involked removeLastAsset");
	LinkedList list=(LinkedList)linkedList;
      System.out.println(list.removeLast());
	
		
}
	@Override
	public void removeFirstAsset() {
		System.out.println("Involked removeFirstAsset");
		LinkedList list=(LinkedList)linkedList;
		System.out.println(list.removeFirst());
		
	}

	@Override
	public void getFirstAsset() {
		System.out.println("Involked getFirstAsset");
		LinkedList list=(LinkedList)linkedList;
		System.out.println(list.getFirst());
		
		
	}

	@Override
	public void getLastAsset() {
		System.out.println("Involked getLastAsset");
		LinkedList list=(LinkedList)linkedList;
		System.out.println(list.getLast());
	}

	@Override
	public void addFirstAsset(Object object) {
		System.out.println("Involked addFirstAsset");
		LinkedList list=(LinkedList)linkedList;
		list.addFirst(object);
		
	}

	@Override
	public void addLastAsset(Object object) {
		System.out.println("Involked addLastAsset");
		LinkedList list=(LinkedList)linkedList;
		list.addLast(object);
		
	}

	@Override
	public void addAsset(Object object) {
		System.out.println("Involked removeLastAsset");
		
	}

	@Override
	public boolean searchAsset(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateAsset(Object object, String newName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAsset(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listOfAllAssets() {
         System.out.println("Involked listOfAllAssets");
        Iterator iterator= collection.iterator();
        while(iterator.hasNext()) {
        	Object object=iterator.next();
        	System.out.println(object);
        }
         
     
		
	}

}
