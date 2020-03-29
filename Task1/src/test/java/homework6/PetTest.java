package homework6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PetTest {

    @Test
    void testToString() {
        String[] habits = {"eating","running"};
        Pet cat = new Pet(Species.CAT,"Garfield",3,habits);
        String expected = "CAT{nickname='Garfield', age=3, habits=[eating, running]}";
        assertEquals(expected,cat.toString(),"Strings are not same!");
    }
    @Test
        void testEqualsBoolean() {

            String[] habits = {"eating","running"};
            Pet pet = new Pet(Species.CAT,"Garfield",3,habits);
            Pet pet1 = new Pet(Species.CAT,"Garfield",3,habits);
            assertTrue(pet.equals(pet1),"Pets are not same!");

        }


}