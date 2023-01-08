package com.masai.decorator;

public class Sugar extends AddOn{
	Beverage beverage;

	public Sugar(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+"sugar added ";
	}

	@Override
	public double cost() {
		return beverage.cost()+10;
	}
	
}
