package com.masai.decorator;

public class DarkRoast extends Beverage{
	public DarkRoast() {
		super();
		description="DarkRoast ";
	}
	@Override
	public double cost() {
		return 300.00;
	}
}
