package Figure;

import java.util.ArrayList;

public class GeomApp {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(new Point(1,2),3));
        figures.add(new Rectangle(new Point(1,2), new Point(2,3)));
        figures.add(new Triangle(new Point(1,2),new Point(1,2), new Point(2,3)));
        int total_area = 0;
        for (Figure f: figures) {
            total_area += f.area();
        }
        System.out.println(total_area);
    }

}
