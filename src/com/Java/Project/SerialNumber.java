package com.Java.Project;

public class SerialNumber {

	private static SerialNumber instance;
	private String productPrefix;
	private int count;
	
	public enum ProductType {LargeGadget, MediumGadget, SmallGadget, LargeWidget, MediumWidget, SmallWidget};
	
	public synchronized static SerialNumber getInstance() {
		if (instance == null) {
			instance = new SerialNumber();
		}
		return instance;
	}
	private SerialNumber() {}
	
	public synchronized String getNextSerial(ProductType type) {
		int value ;
		switch (type) {
		case LargeGadget:
			productPrefix = "32LG";
			count = 2356;
			value = ++count;
			return productPrefix + value;
		case MediumGadget:
			productPrefix = "43MG";
			count = 3356;
			value = ++count;
			return productPrefix + value;
		case SmallGadget:
			productPrefix = "53SG";
			count = 4356;
			value = ++count;
			return productPrefix + value;
		case LargeWidget:
			productPrefix = "33LW";
			count = 2366;
			value = ++count;
			return productPrefix + value;
		case MediumWidget:
			productPrefix = "43MW";
			count = 3366;
			value = ++count;
			return productPrefix + value;
		case SmallWidget:
			productPrefix = "53SW";
			count = 4366;
			value = ++count;
			return productPrefix + value;
		default:
			return "No type Provided";
		
		}
	}
}
	

