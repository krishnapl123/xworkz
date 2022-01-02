package collection_framework.treeSet;

import java.util.Comparator;

public class SoftwareNameComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO o1, SoftwareDTO o2) {
		
		int value=o1.getName().compareTo(o2.getName());
		
		if(value<0)
          return -100;

		if(value>0)
          return 100; 

		if(value==0)
          return 0;
		return 0;
	}

}
