package collection_framework;

import java.util.Collection;
import java.util.*;

public class AssetContainer implements Asset {
	
		Collection collection=new ArrayList();

	@Override
	public void addAsset(Object object) {
		System.out.println("Involked AddAsset");
		collection.add(object);
		
		
	}

	@Override
	public boolean searchAsset(Object object) {
		System.out.println("Involked searchAsset");
		boolean result=collection.contains(object);
		return result;
		
		
	}

	@Override
	public void updateAsset(Object object, String newName) {
		System.out.println("Involked updateAsset");
		ArrayList container=(ArrayList)collection;
		int index=container.indexOf(object);
		Object asset=container.get(index);
		Book1 bookAsset=(Book1)asset;
		bookAsset.setName(newName);
		container.add(index, bookAsset);
	}

	@Override
	public void deleteAsset(Object object) {
		System.out.println("Involked deleteAsset");
		collection.remove(object);
		
	}

	@Override
	public void listOfAllAssets() {
		System.out.println("Involked listAsset");
		System.out.println(collection);
		
	}
}
