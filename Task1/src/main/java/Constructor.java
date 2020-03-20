package Homework8;

public class Constructor {
 final String verb;
 final String object;
 final String subject;

    public Constructor(String verb, String object, String subject) {
        this.verb = verb;
        this.object = object;
        this.subject = subject;
    }

    private String build() {
        return String.format("%s: %s %s", subject, verb, object);
    }
    @Override
    public String toString() {
        return build();
    }
}
