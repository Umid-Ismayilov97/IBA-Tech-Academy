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


    public ArrayList<Human> getChildren() {

        return children;

    }



    public Pet getPet() {

        return pet;

    }



    public void setPet(Pet pet) {

        this.pet = pet;

    }



    public Family(Human mother, Human father) {

        this.mother = mother;

        this.father = father;

        children = new ArrayList<Human>();

    }





    public boolean deleteChild(int index){

        if(index - 1 >= children.size()) return false;

        else{

            children.remove(index - 1);

        }

        return true;

    }



    @Override

    public String toString() {

        String result = String.format("Family{mother=%s, father=%s",

                mother.toString(), father.toString());

        if(children.size() > 0){

            result += String.format(", children=%s",children.toString());

        }

        if(pet != null){

            result += String.format(", pet=%s",pet.toString());

        }

        result += "}";

        return result;

    }
}
