package collection_framework.treeSet;

import java.util.Comparator;

public class SoftwarePriceComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO o1, SoftwareDTO o2) {
	
		Double price1=(Double)o1.getPrice();
		Double price2=(Double)o2.getPrice();
		
		return price1.compareTo(price2);
	}

}
