package oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

public class Circle extends Shape {
//    @Getter @Setter
//    private String color;

//    @Getter @Setter
//    private int vertices;

    @Getter @Setter
    private int radius;

    public Circle(String color, int vertices, int radius){
        super(color, vertices);
        this.radius = radius;
    }

//    NON-STATIC - NEEDS TO BE CALLED FROM THE OBJECT
    public void printCircle(){
        System.out.println("Color: " + super.getColor());
        System.out.println("Vertices count: " + super.getVertices());
        System.out.println("Radius: " + this.radius);
        System.out.println(".........................");
    }
    @Override
    public void printShape(){
        printCircle();
    }

}
