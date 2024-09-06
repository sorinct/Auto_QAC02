package oop2;

import com.google.common.util.concurrent.ExecutionList;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape("fuchsia", 0);
        s1.setColor("red");
        System.out.println("The color of the shape is " + s1.getColor());

        Circle c1 = new Circle();
        c1.setVertices(1);
        c1.setRadius(5);
         c1.setColor("green");
//        System.out.println("The color of the circle is " + c1.getColor());
        c1.printCircle();


        Circle c2 = new Circle ("white" , 1, 7);
//        System.out.println(c1.getColor());
        Circle c3 = new Circle("green" , 1, 5);
        c2.printCircle();
        c3.printCircle();
//        c3.setColor("blue");

//       STATIC - PRINT
        Utils.printCircleStatic(c3);


//        System.out.println("The color of the circle is " + c2.getColor());
        Rectangle r1 = new Rectangle();
        Square sq1 = new Square(5);
        System.out.println(sq1.getArea());

//        SHAPE - CLASA PARINTE
        Shape r2 = new Rectangle(6, 7);
        Shape sq2 = new Square(8);
    }
}
