package Figure;

public class Circle extends Figure{
    Point center;
    int radius;

    public static Circle random (){
        return new Circle (Point.random(),Extra.random());
    }
    public Circle( Point center,int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public int area (){
        return (int) (Math.PI*Math.pow(this.radius,2));
    }
}
