package Homework5;

import Homework4.Human;
import Homework4.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;

    private Human father;

    private ArrayList<Human> children;

    private Pet pet;
    //////////////////////////////////////////


    public Family(Human mother, Human father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
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

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {

        return pet;

    }

    public void setPet(Pet pet) {

        this.pet = pet;

    }
        public void addChild (){

    }
    public void deleteChild (){

    }
    public void countFamily (){

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

        return Objects.hash(mother, father);

    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}
