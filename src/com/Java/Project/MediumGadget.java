package com.Java.Project;

import java.util.ArrayList;
import java.util.List;

public class MediumGadget extends Gadget{

public MediumGadget() { this(SurfaceColor.PAINTED); }
	
	public MediumGadget(SurfaceColor color) {
		super(color); 
		this.serialNumber = SerialNumber.getInstance()
				.getNextSerial(SerialNumber.ProductType.MediumGadget); 
	
}
	
	public List<WidgetInterface> getWidgets(SurfaceColor color) {
		List<WidgetInterface> myList = new ArrayList<>(); 
		myList.add(new LargeWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new SmallWidget(color)); 
		myList.add(new SmallWidget(color)); 
		return myList; 
		
	}
	
	@Override
	public int getSwitches() {
		return 1;
	}
	@Override
	public int getButtons() {
		return 2;
	}
	@Override
	public int getLights() {
		return 3;
	}
	@Override
	public String getPowerSource() {
		return "Solar Power";
	}
	@Override
	public float getPrice() {
		return 29.99F;
	}
	
}