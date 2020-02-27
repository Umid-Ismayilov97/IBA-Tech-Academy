package Homework5;

import Homework4.Human;
import Homework4.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;

    private Human father;

    private Human[] children;

    private Pet pet;
    int counOfChild=0;


    public Family() {

    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {

        return mother;

    }

    public void setMother(Human mother) {

        this.mother = mother;

    }

    public Human getFather() {

        return father;

    }

    public void setFather(Human father) {

        this.father = father;

    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {

        return pet;

    }

    public void setPet(Pet pet) {

        this.pet = pet;

    }
    public void addChild(Human child){


        children[counOfChild]=child;
        counOfChild++;

    }
    public boolean deleteChild(int index){

        if(index >=0 && index < counOfChild) return false;

        else{

            for (int i = index+1; i <counOfChild ; i++) {
                children[i-1]=children[i];
            }
            counOfChild--;

        }
        return true;
    }
    public int countFamily(){


return  counOfChild+2;

        }

    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Family family = (Family) o;

        return mother.equals(family.mother) &&

                father.equals(family.father);

    }

    @Override

    public int hashCode() {

        return Objects.hash(mother,father);

    }

    @Override
    public String toString() {

        return String.format("%s{father='%s', mother=%d, pet=%d, children=%s}",

                father, mother, pet, Arrays.toString(children));
    }

}
