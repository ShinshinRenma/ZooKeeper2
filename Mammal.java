package com.ryanlayman;

public class Mammal {
	protected int energyLevel = 100;
	
	public void displayEnergy() {
		System.out.printf("Current energy level: %s", this.energyLevel);	
	}
}
