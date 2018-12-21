package com.Java.Project;

import java.util.List;

public interface GadgetInterface {
public List<WidgetInterface> getWidgets(SurfaceColor color);
public String getSerialNumber();
	public float getPrice();
	public String getPowerSource();
	public int getLights();
	public int getButtons();
	public int getSwitches();
	public SurfaceColor getColor();
	
}