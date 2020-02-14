public class PizzaApp {
    public static void main(String[] args) {
        Pizza p = new Pizza();
        p.price=20;
        p.name="Peperoni";
        p.size = 25;
        Pizza p2 = new Pizza();
        p2.price=15;
        p2.name="Margarita";
        p2.size = 20;
        System.out.println(Pizza.count);
    }
}
