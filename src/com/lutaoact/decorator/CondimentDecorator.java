package com.lutaoact.decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	
	public abstract String getDescription();
	public int getSize() {
		return beverage.getSize();
	}
}
