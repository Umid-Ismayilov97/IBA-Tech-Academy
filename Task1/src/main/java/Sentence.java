package Homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    private static List<String> list(String ... items) {
        return Arrays.asList(items);
    }
    public static void main(String[] args) {
        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs =    list("wrote", "chased", "slept on");
        List<String> objects =  list("the book","the ball","the bed");

        ArrayList<Sentence> outcome = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(subjects.get(i)+":"+verbs.get(j)+" "+objects.get(j));
                }
            }
        }

    }
}
