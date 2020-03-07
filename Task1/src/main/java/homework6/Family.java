package homework6;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private int indexOfChild=0;
    private Human father;
    private Human[] children;
    private Pet pet;
    int countOfChild;

    @Override

    protected void finalize() throws Throwable {

        System.out.println("Family object is removed!");

        super.finalize();

    }

    public Family() {

    }

    public Family(Human mother,Human father,int countOfChild) {
        this.mother = mother;
        this.father = father;
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
            System.out.println("Your input does not exist");
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
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
