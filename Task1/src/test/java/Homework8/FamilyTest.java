package Homework8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Woman mother;

    Man father;

    Human child;

    Family celebrities;

    @BeforeEach

    void testInit(){

        //
        Map<String, String> motherSchedule = new HashMap<>();

        motherSchedule.put(DayOfWeek.SUNDAY.name()," Just rest");

        motherSchedule.put(DayOfWeek.MONDAY.name()," Go to work");

        motherSchedule.put(DayOfWeek.TUESDAY.name()," Go to work");

        motherSchedule.put(DayOfWeek.WEDNESDAY.name()," Go to work");

        motherSchedule.put(DayOfWeek.THURSDAY.name()," Go to work ");

        motherSchedule.put(DayOfWeek.FRIDAY.name()," Go to work");

        motherSchedule.put(DayOfWeek.SATURDAY.name()," Go to cinema and museum");


        //
        Map<String, String> fatherSchedule = new HashMap<>();

        fatherSchedule.put(DayOfWeek.SUNDAY.name()," Just rest");

        fatherSchedule.put(DayOfWeek.MONDAY.name()," Go to work");

        fatherSchedule.put(DayOfWeek.TUESDAY.name()," Go to work");

        fatherSchedule.put(DayOfWeek.WEDNESDAY.name()," Go to work");

        fatherSchedule.put(DayOfWeek.THURSDAY.name()," Go to work ");

        fatherSchedule.put(DayOfWeek.FRIDAY.name()," Go to work");

        fatherSchedule.put(DayOfWeek.SATURDAY.name()," Go to cinema and museum");


        //
        Map<String, String> childSchedule = new HashMap<>();

        childSchedule.put(DayOfWeek.SUNDAY.name()," Just rest");

        childSchedule.put(DayOfWeek.MONDAY.name()," Go to work");

        childSchedule.put(DayOfWeek.TUESDAY.name()," Go to work");

        childSchedule.put(DayOfWeek.WEDNESDAY.name()," Go to work");

        childSchedule.put(DayOfWeek.THURSDAY.name()," Go to work ");

        childSchedule.put(DayOfWeek.FRIDAY.name()," Go to work");

        childSchedule.put(DayOfWeek.SATURDAY.name()," Go to cinema and museum");


        mother = new Woman("Anna","Grimes",40,motherSchedule);

        father = new Man("Rick","Grimes",44,fatherSchedule);

        child = new Man(   "Baby","Joda",41,childSchedule);

        celebrities = new Family(mother,father);

    }


    @Test

    void addChildIncreaseTest() {

        int beforeAdd = celebrities.getChildren().size();

        celebrities.addChild(child);

        int afterAdd = celebrities.getChildren().size();

        assertEquals(beforeAdd + 1,afterAdd,"Add child should increase number of children just 1");

    }

    @Test

    void addChildReferenceTest() {

        celebrities.addChild(child);

        Human acceptedChild  = (Human) celebrities.getChildren().get(celebrities.getChildren().size() - 1);

        assertEquals(child,acceptedChild,"Child should be same");

    }

    @Test

    void deleteExistingChildTest() {

        celebrities.addChild(child);

        final int beforeDeleting = celebrities.getChildren().size();

        assertEquals(true,celebrities.deleteChild(child),"Child didn't deleted");

        final int afterDeleting = celebrities.getChildren().size();

        assertNotEquals(beforeDeleting,afterDeleting,"It doesn't delete any child");

    }

    @Test

    void deleteNonExistingChildTest() {

        final int beforeDeleting = celebrities.getChildren().size();

        assertEquals(false,celebrities.deleteChild(child),

                "Trying to delete non-existing child");

        final int afterDeleting = celebrities.getChildren().size();

        assertEquals(beforeDeleting,afterDeleting,

                "It should stay same");

    }

    @Test

    void deleteExistingChildIndexTest() {

        celebrities.addChild(child);

        final int beforeDeleting = celebrities.getChildren().size();

        assertEquals(true,celebrities.deleteChild(1),

                "Child index didn't deleted");

        final int afterDeleting = celebrities.getChildren().size();

        assertNotEquals(beforeDeleting,afterDeleting,

                "It doesn't delete any child index");

    }

    @Test

    void deleteNonExistingChildIndexTest() {

        final int beforeDeleting = celebrities.getChildren().size();

        assertEquals(false,celebrities.deleteChild(5),

                "Trying to delete non existing index");

        final int afterDeleting = celebrities.getChildren().size();

        assertEquals(beforeDeleting,afterDeleting,

                "It should remain same because of non existing index deletion process");

    }

    @Test

    void countFamily() {

        celebrities.addChild(child);

        assertEquals(3,celebrities.countFamily(),

                "Family members are not count in a right way");

    }

}