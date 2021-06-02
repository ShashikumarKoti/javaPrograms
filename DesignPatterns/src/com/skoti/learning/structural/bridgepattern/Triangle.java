package com.skoti.learning.structural.bridgepattern;

public class Triangle extends Shape {

	public Triangle(Colour color) {
		super(color);
	}

	@Override
	void applyColor() {
		System.out.print("Triangle filled with ");
		color.applyColor();
	}
}
