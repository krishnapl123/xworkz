package collection_framework.treeSet;

import java.util.Comparator;

public class SoftwareInternetAppComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO o1, SoftwareDTO o2) {
           
		Boolean b1=(Boolean) o1.isInternetApp();
		Boolean b2=(Boolean) o2.isInternetApp();

		return 0;
	}

}
