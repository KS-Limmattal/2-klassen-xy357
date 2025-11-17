import java.awt.Point;

public class PointTester {
    

    public static void main(String[] args) {
        Point q = new Point(2,5);       //1.
        System.out.println(q.toString());

        double xq= q.getX();                //2.
        double yq= q.getY();
        q.setLocation(yq, xq);
        System.out.println(q.toString());

        Point r = new Point(q.getLocation());   //3.
        System.out.println(r.toString());

            //Test
            System.out.println(r.equals(q));    //Inhaltsgleichheit
            System.out.println(r==q);           //Objektgleichheit
    }
}
