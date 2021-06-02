package com.skoti.learning.creational.factorypattern;

public class ShapeFactory {

	public Shape getShape(String shape) {
		if(shape==null) {
			return null;
		}
		else if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("pentagon")) {
			return new Pentagon();
		}
		else
			return null;
	}
}
