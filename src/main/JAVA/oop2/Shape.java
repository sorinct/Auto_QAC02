package oop2;
// toate metodele
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
 public class Shape implements IShape  {
    @Getter @Setter
    private String color;

    @Getter @Setter
    private int vertices;

public int getArea(){
    return 0;
}

    @Override
    public void draw() {

    }

    @Override
    public void printShape() {

    }

    @Override
    public int countVertices() {
        return 0;
    }


//    @Override
//    public void draw() {
//
//    }
//
//    @Override
//    public void printShape() {
//
//    }
//
//    @Override
//    public int countVertices() {
//        return 0;
//    }
}











//    public Shape(String color) {
//        this.color = color;
//    }
//    public String getColor() {
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }