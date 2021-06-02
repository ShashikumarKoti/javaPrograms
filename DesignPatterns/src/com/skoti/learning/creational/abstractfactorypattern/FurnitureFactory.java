package com.skoti.learning.creational.abstractfactorypattern;

public abstract class FurnitureFactory {

	abstract Chair createChair(String chairType);
	
	abstract Sofa createSofa(String sofaType);
}
