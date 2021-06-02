package com.skoti.learning.creational.abstractfactorypattern;

public class FurnitureFactoryProducer {

	public static FurnitureFactory getFurniture(String furnitureType) {
		if(furnitureType.equalsIgnoreCase("modern")) {
			return new ModernFactory();
		}else if(furnitureType.equalsIgnoreCase("antique")) {
			return new AntiqueFactory();
		}
		else
			return null;
	}
}
