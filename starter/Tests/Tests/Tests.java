package Tests;

import Animal.Animal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    private Animal animal;

    @Before
    public void createAnimal() {
        this.animal = new Animal(4, 30, true, "Oliphant");
    }

    @Test
    public void testIfFactExists() {
        assertEquals("The Oliphant has a top speed of 30 mph.", animal.getFact());
    }
}
