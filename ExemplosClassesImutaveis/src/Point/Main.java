package Point;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(2, 5);
        Point q = new Point(10, 2);

        System.out.println("P: " + p);
        System.out.println("Q: " + q);
        System.out.println("Distancia P e Q: " + p.distanceTo(q));
    }
}
