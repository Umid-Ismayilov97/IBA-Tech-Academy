import java.lang.reflect.Array;
import java.util.*;


import static Figure.Extra.random;

public class NumbersApp {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 30 ; i++) {
            ints.add((int) (Math.random()*20)-10);
        }
        HashSet<Integer> unique = new HashSet<>();
        for (int i = 0; i <ints.size() ; i++) {
            unique.add(ints.get(i));
        }
        ArrayList <Integer> sorted = new ArrayList<>();
        for(int el:unique){
            sorted.add(el);

    }
        Collections.sort(sorted);
        System.out.printf("Origin:%s\n",ints);
        System.out.printf("Unique:%s\n",unique);
        System.out.printf("Unique sorted:%s\n",sorted);
}
}
