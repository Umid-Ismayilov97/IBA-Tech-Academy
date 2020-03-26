package Homework8;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void testEqualsBoolean() {

        Set<String> habits = new HashSet<>();
        habits.add("play with balls");
        habits.add("play with toys");
        Pet domesticCat = new DomesticCat("Garfield",Species.DOMESTICCAT,2,habits);
        Pet domesticCat2 = new DomesticCat("Garfield",Species.DOMESTICCAT,2,habits);
        assertTrue(domesticCat.equals(domesticCat2),"Pets are not same!");

    }

    @Test
    void testToString() {
        Set<String> habits = new HashSet<>();
        habits.add("play with balls");
        habits.add("play with toys");
        String expected = "Pet{nickname='Garfield', species=DOMESTICCAT, age=2, habits=[play with balls, play with toys]}";
        DomesticCat domesticCat = new DomesticCat("Garfield",Species.DOMESTICCAT,2,habits);
        assertEquals(expected,domesticCat.toString(),"To string is not working properly");
    }
}