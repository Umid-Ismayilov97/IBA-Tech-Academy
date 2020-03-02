package Homework6;

import homework6.Pet;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private int indexOfChild=0;
    private Human father;
    private Human[] children;
    private Pet pet;
    int counOfChild;


    public Family() {

    }

    public Family(Human mother, Human father, Pet pet,int counOfChild) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.counOfChild=counOfChild;
        this.children=new Human[counOfChild];
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


        children[indexOfChild++]=child;


    }
    public boolean deleteChild(int indexOfChildrenArray) {
        if(this.children==null || indexOfChildrenArray < 0 || indexOfChildrenArray > this.children.length-1)
            return false;
        Human[] children2 = new Human[this.children.length-1];
        for(int i = 0, k = 0; i < children.length; i++) {
            if(i == indexOfChildrenArray)
                continue;
            children2[k++] = this.children[i];
        }
        this.children = children2;
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
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
