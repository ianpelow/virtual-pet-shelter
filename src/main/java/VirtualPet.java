import org.hamcrest.Matcher;

public class VirtualPet {


	private String petName;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;
	private int amount = 10;
	
	
		public String getPetName() {
			return petName;
		}
		
			public String setPetName(String petName) {
				return petName;
		}
		

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public int getHunger() {
				return hunger;
			}

			public void setHunger(int hunger) {
				this.hunger = hunger;
			}

			public int getThirst() {
				return thirst;
			}

			public void setThirst(int thirst) {
				this.thirst = thirst;
			}

			public int getBoredom() {
				return boredom;
			}

			public void setBoredom(int boredom) {
				this.boredom = boredom;
			}
			
			public int waterPet() {
				thirst += amount;
				return thirst;
			}
			
			public int feedPet() {
				hunger += amount;
				return hunger;
			}
			
			public int playWithPet() {
				boredom += amount;
				return boredom;
			}
			
			public VirtualPet(String petName, String description, int hunger, int thirst, int boredom) {
				super();
				this.petName = petName;
				this.description = description;
				this.hunger = hunger;
				this.thirst = thirst;
				this.boredom = boredom;	
			}
			
			public void singleTick() {
				hunger -= 2;
				thirst -= 2;
				boredom -= 2;
			}
			
				public void getStatus () {
					System.out.println(petName + " - " + description + " / Hunger: " +  hunger + " / Thirst " + thirst + " / Boredom: " + boredom);
			}
			
}
			
			
			

