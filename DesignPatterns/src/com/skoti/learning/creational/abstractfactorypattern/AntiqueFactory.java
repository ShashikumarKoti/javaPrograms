package com.skoti.learning.creational.abstractfactorypattern;

public class AntiqueFactory extends FurnitureFactory {

	@Override
	Chair createChair(String chairType) {
		if (chairType.equalsIgnoreCase("achair")) {
			return new AntiqueChair();
		} else {
			return null;
		}
	}

	@Override
	Sofa createSofa(String sofaType) {
		if (sofaType.equalsIgnoreCase("asofa")) {
			return new AntiqueSofa();
		} else {
			return null;
		}
	}

}
