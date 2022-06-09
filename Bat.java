package com.ryanlayman;

public class Bat extends Mammal {
	
		
		public Bat() {
			super();
			this.energyLevel = 300;
		}
		
		public void fly() {
			if(this.energyLevel < 50) {
				System.out.println("\nThe bat is too tired to fly.");
			}
			else {
				this.energyLevel -= 50;
				System.out.println("\nFWOOSH!  FLAP FLAP FLAP!");
				this.displayEnergy();
			}
			
		}
		
		public void eatHumans() {
			this.energyLevel += 25;
			System.out.println("\nDon't watch!  It's eating a human!");
			this.displayEnergy();
			
		}
		
		public void attackTown() {
			if(this.energyLevel < 100) {
				System.out.println("\nThe bat is too tired to raze the town.");
			}
			else {
				this.energyLevel -= 100;
				System.out.println("\nOh God!  It's killing everyone!");
				this.displayEnergy();
			}
		}
}
