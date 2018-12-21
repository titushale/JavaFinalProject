package com.Java.Project;

public class SmallWidget extends Widget{
	public SmallWidget(SurfaceColor color) {
		super (color); 
	}
	
	/**
	 * 
	 * @return
	 */
	@Override 
	public String getGears() {
		return "2 Gears"; 
		
	}
	@Override public String getSprings() {
		return "3 Springs"; 
		
	}
	@Override 
	public String getLevers() {
		return "1 Lever"; 
	}

	@Override
	public String getSmallWidget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMediumWidget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLargeWidget() {
		// TODO Auto-generated method stub
		return null;
	}
}