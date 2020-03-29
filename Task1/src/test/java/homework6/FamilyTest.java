package homework6;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;



class FamilyTest {

    Human mother;

    Human father;

    Human child;

    Family celebrities;

    @BeforeEach

    void init(){

        mother = new Human("Anna","Grimes",1972,48,95);

        father = new Human("Rick","Grimes",1970,50,99);

        child = new Human("Judy","Grimes",2009,11,98);

        celebrities = new Family(mother,father);

    }

    @Test

    void addChildIncreaseTest() {

        int beforeAdd = celebrities.getChildren().length;

        celebrities.addChild(child);

        int afterAdd = celebrities.getChildren().length;

        assertEquals(beforeAdd + 1,afterAdd,"Add child should increase number of children just 1");

    }

    @Test

    void addChildReferenceTest() {

        celebrities.addChild(child);

        Human acceptedChild  = (Human) celebrities.getChildren()[celebrities.getChildren().length - 1];

        assertEquals(child,acceptedChild,"Child should be same");

    }

    @Test

    void deleteExistingChildIndexTest() {

        celebrities.addChild(child);

        final int beforeDeleting = celebrities.getChildren().length;

        assertEquals(true,celebrities.deleteChild(1),

                "Child index didn't deleted");

        final int afterDeleting = celebrities.getChildren().length;

        assertNotEquals(beforeDeleting,afterDeleting,

                "It doesn't delete any child index");

    }

    @Test

    void deleteNonExistingChildIndexTest() {



        final int beforeDeleting = celebrities.getChildren().length;

        assertEquals(false,celebrities.deleteChild(5),

                "Trying to delete non existing index");

        final int afterDeleting = celebrities.getChildren().length;

        assertEquals(beforeDeleting,afterDeleting,

                "It should remain same because of non existing index deletion process");

    }

    @Test

    void countFamily() {

        celebrities.addChild(child);

        assertEquals(3,celebrities.countFamily(),

                "Family members were not count in a right way");

    }

    @Test

    void equalsTest(){

        Family testFamily = new Family(mother,father);

        assertEquals(celebrities,testFamily,"Families are not equal");

    }

}