public class main {

    public static void main(String arg[]){


        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));


        Object o1 = new Rectangle(5,10);
        Object o2 = new Rectangle(15,15);
        Object o3 = new Square(5,5);
    
        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));

        Point p = new Point(0, 0);
        System.out.println("Point before: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("Point after moveUp + moveRight: " + p);

        Circle c = new Circle(new Point(3, 3), 5);
        System.out.println("\nCircle before: " + c);
        c.moveDown();
        c.moveLeft();
        System.out.println("Circle after moveDown + moveLeft: " + c);
    }
}
