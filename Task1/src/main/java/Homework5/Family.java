package Homework5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private int indexOfChild=0;
    private Human father;

    private Human[] children;

    private Pet pet;
    int countOfChild;


    public Family() {

    }

    public Family(Human mother, Human father, Pet pet,int countOfChild) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.countOfChild=countOfChild;
        this.children=new Human[countOfChild];
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
        if(indexOfChildrenArray > children.length-1){
            System.out.println("////////////////////////////////////////\n"+"You have " + countOfChild + " children.Your index is big!!!"+"\n////////////////////////////////////////");
            return false;
        }
        Human [] children2=new Human[children.length - 1];
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if(i==indexOfChildrenArray) continue;

            children2[count++] = children[i];
        }
        children = children2;
        return true;
    }
    public int countChildren (){
        return children.length;
    }
    public int countFamily(){


        return  children.length+2;

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
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}", mother, father, Arrays.toString(children), pet);
    }
}
