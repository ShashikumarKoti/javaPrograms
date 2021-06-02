package com.skoti.learning.structural.bridgepattern;

public abstract class Shape {

	protected Colour color;
	
	//constructor with implementor as input argument
	public Shape(Colour color) {
		this.color = color;
	}
	
	abstract void applyColor();
}
