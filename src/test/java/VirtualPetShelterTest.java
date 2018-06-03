import static org.junit.Assert.assertTrue;

import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;



public class VirtualPetShelterTest {
	
	VirtualPetShelter testAnimalShelter = new VirtualPetShelter();
	
	@Test
	public void shouldFeedAllPets() {
		VirtualPet petTestFeedAll = new VirtualPet("testAllPetsHunger", "testDescription", 60, 60, 60);
		testAnimalShelter.addPet(petTestFeedAll);
		int preTest = petTestFeedAll.getHunger();
		testAnimalShelter.feedPets();
		int underTest = petTestFeedAll.getHunger();
		assertTrue(preTest < underTest);
	} 
	
	@Test
	public void shouldGiveAllPetsWater() {
		VirtualPet petTestGiveAllWater = new VirtualPet(null, null, 0, 0, 0);
		testAnimalShelter.addPet(petTestGiveAllWater);
		int preTest = petTestGiveAllWater.getThirst();
		testAnimalShelter.waterAllPets();
		int underTest = petTestGiveAllWater.getThirst();
		assertTrue(preTest < underTest);	
	}
	
	@Test
    public void shouldAllowPetToBeSurrendered() {                    
        VirtualPetShelter petTestAddNewPet = new VirtualPetShelter();                                                                 
        testAnimalShelter.addPet(new VirtualPet(null, null, 0, 0, 0));
        Assert.assertEquals(1, testAnimalShelter.getPets().size());
    }
	
//	VirtualPetShelter testPetShelter = new VirtualPetShelter();
//    testPetShelter.addPet(new VirtualPet("Rusty", "He doesn't get hungry, he's Dead!", 5, 30, 20));
//    testPetShelter.addPet("Grazer", new VirtualPet("Grazer", "She cant leave.. she's dead too!", 10, 20, 30));
//    testPetShelter.waterAllPets(); // I need to water pets, got error and eclipse asked me to create waterAllPets in VPS 
//    Assert.assertEquals(17, testPetShelter.virtualPets.get("Rusty").thirst); // waterAllPets decrements thirst
//    Assert.assertEquals(27, testPetShelter.virtualPets.get("Grazer").thirst); // waterAllPets decrements thirst

	{
		// Arrange
		//- set up shelter
		//- set up pet1
		//- set up pet2
		//- check pet1 hunger (hungerBefore1)
		//- check pet2 hunger (hungerBefore2)
		
		// Act
		//- call shelter.feedAllPets()
		
		// Assert
		//- check pet1 hunger (hungerAfter1)
		//- check pet2 hunger (hungerAfter2)
		//- assert hungerBefore1 > hungerAfter1
		//- assert hungerBefore2 > hungerAfter2
	
	
//		@Test
//		public void	Collection<VirtualPet> getPetsShouldReturnAllPets() {
//		testAnimalShelter.addPet(new VirtualPet("Maulik", "cat", 60, 60, 60));
//		Collection underTest = testAnimalShelter.getPets();
//		Assert.assertEquals("Maulik", underTest);
//		
//		
	}

//	private Collection thatCollectionWillGetPets() {
//		
//		return null;
//	}
	
}