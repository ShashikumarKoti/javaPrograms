package com.skoti.learning.creational.factorypattern;

import java.util.Objects;

public class ShapeDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circleShape = shapeFactory.getShape("circle");
		circleShape.draw();
		
		Shape pentagonShape = shapeFactory.getShape("pentagon");
		pentagonShape.draw();
		
		Shape anyShape = shapeFactory.getShape("anyShape");
		if(!Objects.isNull(anyShape)) {
		anyShape.draw();
		}else {
			System.out.println("Given shape not availble");
		}
	}
}
