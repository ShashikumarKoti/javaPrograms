package com.skoti.learning.creational.abstractfactorypattern;

public class ModernFactory extends FurnitureFactory {

	@Override
	public Chair createChair(String chairType) {
		if(chairType.equalsIgnoreCase("mchair")) {
		return new ModernChair();
		}else {
			return null;
		}
	}

	@Override
	public Sofa createSofa(String sofaType) {
		if (sofaType.equalsIgnoreCase("msofa")) {
			return new ModernSofa();
		} else {
			return null;
		}
	}
}
