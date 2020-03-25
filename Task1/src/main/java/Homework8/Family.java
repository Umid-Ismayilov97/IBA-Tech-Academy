package Homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {
    private Woman mother;
    private Man father;
    private List<Human> children;
    private Set<Pet> pet;



    public Family(Woman mother, Man father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
        children = new ArrayList<Human>();
    }

    public Family(Woman mother, Man father, Set<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public void addChild(Human child){

        children.add(child);

        child.setFamily(this);

    }

    public boolean deleteChild(int index){

        if(index - 1 >= children.size()) return false;

        else{

            children.get(index - 1).setFamily(null);

            children.remove(index - 1);

        }

        return true;

    }

    public boolean deleteChild(Human child){

        return children.remove(child);

    }

    public int countFamily(){

        int count = children.size();

        if(father.getFamily().equals(this)){

            count++;

        }

        if(mother.getFamily().equals(this)){

            count++;

        }

        return count;

    }

    public Woman getMother() {
        return mother;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
    }

    public Man getFather() {
        return father;
    }

    public void setFather(Man father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return getMother().equals(family.getMother()) &&
                getFather().equals(family.getFather()) &&
                getChildren().equals(family.getChildren()) &&
                getPet().equals(family.getPet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMother(), getFather(), getChildren(), getPet());
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}", mother, father, children, pet);
    }
}
