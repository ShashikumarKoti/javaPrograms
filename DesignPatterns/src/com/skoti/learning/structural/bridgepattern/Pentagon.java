package com.skoti.learning.structural.bridgepattern;

public class Pentagon extends Shape {

	public Pentagon(Colour color) {
		super(color);
	}

	@Override
	void applyColor() {
		System.out.print("Pentagon filled with ");
		color.applyColor();
	}
}
