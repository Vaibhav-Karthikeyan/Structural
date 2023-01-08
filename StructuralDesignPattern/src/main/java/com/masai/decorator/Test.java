package com.masai.decorator;

public class Test {

	public static void main(String[] args) {
		Beverage b1=new HomeBlend();
		b1=new Sugar(b1);
		System.out.println(b1.getDescription()+' '+b1.cost());
		
		Beverage b2=new DarkRoast();
		b2=new Milk(b2);
		b2=new Sugar(b2);
		System.out.println(b2.getDescription()+' '+b2.cost());

	}

}
