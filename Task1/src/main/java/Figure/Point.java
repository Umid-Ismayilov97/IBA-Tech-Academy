package Figure;

public class Point {
    int x;
    int y;
    public static Point random (){
        return new Point (Extra.random(),Extra.random());
    }

//    public Point() {
//        this.x=Extra.random ();
//        this.y=Extra.random ();
//    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
