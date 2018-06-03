import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;



public class VirtualPetShelterTest {
	
	VirtualPetShelter testAnimalShelter = new VirtualPetShelter();
	
	
	
	public void getPetsShouldReturnAllPets() {
		testAnimalShelter.addPet(new VirtualPet("Name", "pet", 60, 60, 60));
		Collection underTest = testAnimalShelter.getPets();
		Assert.assertEquals("Maulik", underTest);
		
		
	}

	private Collection thatCollectionWillGetPets() {
		
		return null;
	}
	
}