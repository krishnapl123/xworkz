package collection_framework.treeSet;

import java.util.Comparator;

public class SoftwareDTOCompareList implements Comparator<SoftwareDTO> {

	private SoftwareNameComparator softwareNameComparator;
	
	private SoftwareIDComparator softwareIDComparator;
	
	private SoftwarePriceComparator softwarePriceComparator;
	
	private SoftwareVersionComparator softwareVersionComparator;
	
	private SoftwareAutoSaveSupportedComprator softwareAutoSaveSupportedComprator;
	
	private SoftwareInternetAppComparator softwareInternetAppComparator;
	
	
	
	
	
	public SoftwareDTOCompareList(SoftwareNameComparator softwareNameComparator,
			SoftwareIDComparator softwareIDComparator, SoftwarePriceComparator softwarePriceComparator,
			SoftwareVersionComparator softwareVersionComparator,
			SoftwareAutoSaveSupportedComprator softwareAutoSaveSupportedComprator,
			SoftwareInternetAppComparator softwareInternetAppComparator) {
		super();
		this.softwareNameComparator = softwareNameComparator;
		this.softwareIDComparator = softwareIDComparator;
		this.softwarePriceComparator = softwarePriceComparator;
		this.softwareVersionComparator = softwareVersionComparator;
		this.softwareAutoSaveSupportedComprator = softwareAutoSaveSupportedComprator;
		this.softwareInternetAppComparator = softwareInternetAppComparator;
	}





	@Override
	public int compare(SoftwareDTO o1, SoftwareDTO o2) {
		int nameRes=softwareNameComparator.compare(o1, o2);
		if(nameRes!=0) {
		 return nameRes; 
		}

		int idRes=softwareIDComparator.compare(o1, o2);
		if(idRes!=0) {
		 return idRes; 
		}
		
		int priceRes=softwarePriceComparator.compare(o1, o2);
		if(priceRes!=0) {
		 return priceRes; 
		}
		
		int versionRes=softwareVersionComparator.compare(o1, o2);
		if(versionRes!=0) {
		 return versionRes; 
		}
		
		
		int autoSaveSupportedRes=softwareAutoSaveSupportedComprator.compare(o1, o2);
		if(autoSaveSupportedRes!=0) {
		 return autoSaveSupportedRes; 
		}
		
		int internetAppRes=softwareInternetAppComparator.compare(o1, o2);
		if(internetAppRes!=0) {
		 return internetAppRes; 
		}
		
		return 0;
		
	}
	}
