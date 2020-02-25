package Animal;

public class Dragon extends Animal {
    public String name;

    public Dragon(String name) {
        this.name = name;
    }
    public void name (){
        System.out.printf("Hello.I'm dragon,my name is %s",name);
    }

    @Override
    public String toString() {
            return "Dragon{" +
                    "name='" + name + '\'' +
                    '}';
    }
}
