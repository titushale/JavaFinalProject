package com.Java.Project;

public class LargeWidget extends Widget {
public LargeWidget(SurfaceColor color) {
	super(color);
	this.serialNumber = SerialNumber.getInstance()
			.getNextSerial(SerialNumber.ProductType.LargeWidget);
}


@Override
public String getGears() {return "9 Gears";}


@Override
public String getSprings() {return "4 Springs";}


@Override
public String getLevers() {return "2 Lever";}


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
