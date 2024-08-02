package courses.java.intro;

import java.sql.SQLOutput;

public class MyFirstClass {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
//      define variable
        int x;

        x=10;
//        System.out.println(x);
        boolean b = true;
        boolean isPrime=true;
        char ch='A';

//      Constanta (tot timpul cu litere mari);
        final double PI=3.14;


//       String is inmutable
        String firstName="John Popescu";
        firstName= "Vasile P";

        System.out.println("division :" + ((float)5/2));
//      compound assignment
        x=x+1;
        System.out.println(x);
        x+=2;
        System.out.println(x);
//        post-increment
       int y = x++;
//        pre-increment
        ++x;
        int z = ++x;
        System.out.println("y=" + y + ", z=" + z);

//        logic operator - not equal
        System.out.println(z==24);
        System.out.println(z!=13);


//        structura conditionare
//        if(z==22 && z<22){
//            System.out.println("z");

//            multiple condition
            char letter='A';
            switch (letter) {
                case 'A':
                System.out.println("Apple");
                break;
                case 'B':
                    System.out.println("Banana");

                    //  number from 10 to n
                    int n = Integer.parseInt(args[0]);
                    int inc = 10;
                    System.out.println("N has value:" + n );
            }

        }
    }

