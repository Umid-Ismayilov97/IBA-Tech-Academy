package Figure;

public class Figure {
public static Figure random(){
    switch ((int)(Math.random()*3)) {
        case 0:return Circle.random();
        case 1:return Triangle.random();
        case 2:return Rectangle.random();

    }
    return null;
}
    public int area(){
        throw new IllegalArgumentException("There is no sense to calculate area of...");
    }

}
