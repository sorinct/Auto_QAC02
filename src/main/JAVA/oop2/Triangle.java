package oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Triangle extends Shape {
//    @Getter @Setter
//    private String color;
//
//    @Getter @Setter
//    private int vertices;

    @Getter @Setter
    private int l1;

    @Getter @Setter
    private int l2;

    @Getter @Setter
    private int l3;
}
