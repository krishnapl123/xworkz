package collection_framework.treeSet;

import java.util.Comparator;

public class SoftwareAutoSaveSupportedComprator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO o1, SoftwareDTO o2) {
		Boolean b1=(Boolean) o1.isAutoSaveSupported();
		Boolean b2=(Boolean) o2.isAutoSaveSupported();
		return b1.compareTo(b2);
	}

}
