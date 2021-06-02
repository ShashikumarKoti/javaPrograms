package com.skoti.learning.structural.bridgepattern;

public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape pentagon = new Pentagon(new BlueColor());
		pentagon.applyColor();
	}
}
