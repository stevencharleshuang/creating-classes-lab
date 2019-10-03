package Tests;

import Animal.Animal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    private Animal animal;

    @Test
    public void testCreateAnimal() {
        Animal testAnimal = new Animal(10, 1000, true, "Freak of Nature");
        assertEquals(10, testAnimal.getNumLegs());
        assertEquals(1000, testAnimal.getTopSpeed());
        assertEquals(true, testAnimal.isEndangered());
        assertEquals("Freak of Nature", testAnimal.getName());
    }

    @Before
    public void createAnimal() {
        this.animal = new Animal(4, 30, true, "Oliphant");
    }

    @Test
    public void testIfFactExists() {
        assertEquals("The Oliphant has a top speed of 30 mph.", animal.getFact());
    }

    @Test
    public void testAnimalGetters() {
        assertEquals(4, animal.getNumLegs());
        assertEquals(30, animal.getTopSpeed());
        assertEquals(true, animal.isEndangered());
        assertEquals("Oliphant", animal.getName());
    }

    @Test
    public void testAnimalSetters() {
        animal.setNumLegs(2);
        animal.setTopSpeed(20);
        animal.setEndangered(false);
        animal.setName("Penguin");
        assertEquals(2, animal.getNumLegs());
        assertEquals(20, animal.getTopSpeed());
        assertEquals(false, animal.isEndangered());
        assertEquals("Penguin", animal.getName());
    }
}
