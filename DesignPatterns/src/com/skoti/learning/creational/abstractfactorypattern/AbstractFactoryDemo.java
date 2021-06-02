package com.skoti.learning.creational.abstractfactorypattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		FurnitureFactory modernFurnitureFactory = FurnitureFactoryProducer.getFurniture("modern");
		Chair modernChair = modernFurnitureFactory.createChair("mchair");
		modernChair.sitOnChair();
		
		FurnitureFactory antiqueFurnitureFactory = FurnitureFactoryProducer.getFurniture("antique");
		Chair antiqueChair = antiqueFurnitureFactory.createChair("achair");
		antiqueChair.sitOnChair();
		
		FurnitureFactory modernSofaFurnitureFactory = FurnitureFactoryProducer.getFurniture("modern");
		Sofa modernSofa = modernSofaFurnitureFactory.createSofa("msofa");
		modernSofa.sitOnSofa();
		
	}
}
