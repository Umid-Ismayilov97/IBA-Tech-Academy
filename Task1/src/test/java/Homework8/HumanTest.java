package Homework8;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testEquals() {

        Map<String,String> schedule = new HashMap<>();

        schedule.put(DayOfWeek.SUNDAY.name(),"Just rest");

        schedule.put(DayOfWeek.MONDAY.name(),"Go to work");

        schedule.put(DayOfWeek.TUESDAY.name(),"Go to work");

        schedule.put(DayOfWeek.WEDNESDAY.name(),"Go to work");

        schedule.put(DayOfWeek.THURSDAY.name(),"Go to work ");

        schedule.put(DayOfWeek.FRIDAY.name(),"Go to work");

        schedule.put(DayOfWeek.SATURDAY.name(),"Go to cinema and museum");
        Human man1 = new Human("Rick","Grimes",44, schedule);

        Human man2 = new Human("Rick","Grimes",44, schedule);

        assertTrue(man1.equals(man2),"Humans are not same");

    }

    @Test
    void testToString() {


        Map<String,String> schedule = new HashMap<>();

        schedule.put(DayOfWeek.SUNDAY.name()," Just rest");

        schedule.put(DayOfWeek.MONDAY.name()," Go to work");

        schedule.put(DayOfWeek.TUESDAY.name()," Go to work");

        schedule.put(DayOfWeek.WEDNESDAY.name()," Go to work");

        schedule.put(DayOfWeek.THURSDAY.name()," Go to work ");

        schedule.put(DayOfWeek.FRIDAY.name()," Go to work");

        schedule.put(DayOfWeek.SATURDAY.name()," Go to cinema and museum");
        String expected = "Human{name='Rick', surname='Grimes', age=44, schedule={WEDNESDAY= Go to work, MONDAY= Go to work, THURSDAY= Go to work , SUNDAY= Just rest, TUESDAY= Go to work, FRIDAY= Go to work, SATURDAY= Go to cinema and museum}}";

        Human man = new Human("Rick","Grimes",44, schedule);

        assertEquals(expected,man.toString(),"To string is not working properly");

    }
}