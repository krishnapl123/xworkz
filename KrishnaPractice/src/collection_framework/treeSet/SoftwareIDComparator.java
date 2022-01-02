package collection_framework.treeSet;

import java.util.Comparator;

public class SoftwareIDComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO o1, SoftwareDTO o2) {
		
		Integer i1=(Integer) o1.getSoftwareId();
		Integer i2=(Integer) o2.getSoftwareId();
	    
		return i1.compareTo(i2);
	}

}
