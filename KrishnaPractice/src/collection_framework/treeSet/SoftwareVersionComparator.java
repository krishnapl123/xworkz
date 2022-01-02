package collection_framework.treeSet;

import java.util.Comparator;

public class SoftwareVersionComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO o1, SoftwareDTO o2) {
   
		Double version1=(Double)o1.getVersion();
		Double version2=(Double)o2.getVersion();
          
		return version1.compareTo(version2);
	}

}
