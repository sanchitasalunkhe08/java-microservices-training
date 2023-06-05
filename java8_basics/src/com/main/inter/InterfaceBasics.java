package com.main.inter;

public class InterfaceBasics implements CalculationImpl {

	
	int num = 10;
	@Override 
	public void addTwo(int increment) {
		System.out.println("increment method has been called");
		num = num + increment;
	}
	
	@Override 
	public void subTwo(int decrement) {
		System.out.println("decrement method has been called");
		num = num - decrement;
	}
	
	
	public static void main(String[] args) {
		InterfaceBasics i = new InterfaceBasics();
		i.addTwo(12);
		System.out.println(i.num);
		i.subTwo(10);
		System.out.println(i.num);
	}
}
