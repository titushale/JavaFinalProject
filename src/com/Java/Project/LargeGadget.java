package com.Java.Project;

import java.util.ArrayList;
import java.util.List;

public class LargeGadget extends Gadget {

	public LargeGadget () { this(SurfaceColor.PAINTED); }

	public LargeGadget(SurfaceColor color) {
		super(color); 
		this.serialNumber = SerialNumber.getInstance()
				.getNextSerial(SerialNumber.ProductType.LargeGadget); 
		
		
	}

	@Override
	public List<WidgetInterface> getWidgets(SurfaceColor color) {
		List<WidgetInterface> myList = new ArrayList<> (); 
		myList.add(new LargeWidget(color)); 
		myList.add(new LargeWidget(color)); 
		myList.add(new LargeWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new MediumWidget(color)); 
		myList.add(new SmallWidget(color)); 
		myList.add(new SmallWidget(color)); 
		myList.add(new SmallWidget(color));  
		return myList;
	}


	@Override
	public int getSwitches() {
		return 2;
	}
	@Override
	public int getButtons() {
		return 4;
	}
	@Override
	public int getLights() {
		return 5;
	}
	@Override
	public String getPowerSource() {
		return "Generator";
	}
	@Override
	public float getPrice() {
		return 39.99F;
		
		}

	}