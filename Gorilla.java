package com.ryanlayman;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		if(this.energyLevel < 5) {
			System.out.println("\nThe gorilla is too tired to throw something.");
		}
		else {
			this.energyLevel -= 5;
			System.out.println("\nUh oh!  The gorilla threw something!  Look out!");
			this.displayEnergy();
		}
		
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("\nThe gorilla ate a banana and regained some energy!");
		this.displayEnergy();
		
	}
	
	public void climb() {
		if(this.energyLevel < 10) {
			System.out.println("\nThe gorilla is too tired to climb a tree.");
		}
		else {
			this.energyLevel -= 10;
			System.out.println("\nThe gorilla is climbing a tree!");
			this.displayEnergy();
		}
		
	}
}
