package com.masai.decorator;

public class Milk extends AddOn{
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+"milk added ";
	}

	@Override
	public double cost() {
		return beverage.cost()+30;
	}

}
