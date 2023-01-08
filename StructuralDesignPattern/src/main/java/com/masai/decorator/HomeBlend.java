package com.masai.decorator;

public class HomeBlend extends Beverage{
	public HomeBlend() {
		super();
		description="HomeBlend ";
	}

	@Override
	public double cost() {
		return 150.00;
	}
	
}
