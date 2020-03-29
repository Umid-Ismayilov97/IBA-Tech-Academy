package homework6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testEquals() {

        String [][] schedule = { {DayOfWeek.SUNDAY.name(),"Just rest"},

                {DayOfWeek.MONDAY.name(),"Go to work"},

                {DayOfWeek.TUESDAY.name(),"Go to work"},

                {DayOfWeek.WEDNESDAY.name(),"Go to work"},

                {DayOfWeek.THURSDAY.name(),"Go to work"},

                {DayOfWeek.FRIDAY.name(),"Go to work"},

                {DayOfWeek.SATURDAY.name(),"Go to cinema or museum"},
        } ;

        Human man1 = new Human("Rick","Grimes",1970,50,99,schedule);
        Human man2 = new Human("Rick","Grimes",1970,50,99,schedule);
        assertTrue(man1.equals(man2),"Human are not same!");
    }

    @Test
    void testToString() {

        Human man = new Human("Rick","Grimes",1970,50,99);

        String expected = "{name='Rick',surname='Grimes',year=1970,age=50,iq=99}";
        assertEquals(expected,man,"Strings are not same!");

    }
}