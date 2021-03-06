import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter testAnimalShelter = new VirtualPetShelter();

	@Test
	public void shouldFeedAllPets() {
		VirtualPet petTestFeedAll = new VirtualPet(null, null, 60, 60, 60);
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
	public void shouldPlayWithPet() {
		VirtualPet petTestPlayWithPet = new VirtualPet(null, null, 0, 0, 0);
		testAnimalShelter.addPet(petTestPlayWithPet);
		int preTest = petTestPlayWithPet.getBoredom();
		testAnimalShelter.playWithAPet(null);
		int underTest = petTestPlayWithPet.getBoredom();
		assertTrue(preTest < underTest);

	}

	@Test
	public void shouldAllowPetAdoption() {
		VirtualPetShelter petTestAdoptPet = new VirtualPetShelter();
		testAnimalShelter.addPet(new VirtualPet(null, null, 0, 0, 0));
		Assert.assertEquals(1, testAnimalShelter.getPets().size());
	}

	@Test
	public void shouldAllowPetToBeSurrendered() {
		VirtualPetShelter petTestAddNewPet = new VirtualPetShelter();
		testAnimalShelter.addPet(new VirtualPet(null, null, 0, 0, 0));
		Assert.assertEquals(1, testAnimalShelter.getPets().size());
	}

	@Test
	public void shouldUpdateAllPetsWithTick() {
		String name = null;
		String description = null;
		int hunger = 1;
		int boredom = 2;
		int thirst = 3;
		VirtualPet testAllPetsWithTick = new VirtualPet(name, description, hunger, boredom, thirst);
		testAllPetsWithTick.singleTick();
		Assert.assertEquals(-1, testAllPetsWithTick.getHunger());
		Assert.assertEquals(1, testAllPetsWithTick.getBoredom());
		Assert.assertEquals(0, testAllPetsWithTick.getThirst());
	}

	@Test
	public void shouldDisplayStatusOfAllPets() {
		VirtualPet petStatusDisplay = new VirtualPet(null, null, 0, 0, 0);
		testAnimalShelter.displayStatus();
		// assertThat(petStatusDisplay.getStatus());
		// Cannot figure out how to test the display of pet status

	}

}