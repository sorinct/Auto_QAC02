package oop3;

import oop2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] values = {1,5,7};
        System.out.println(values[2]);
        Shape[] shapes = {
                new Square(),
                new Triangle(),
                new Circle()
        };
        Shape[] sh2 = new Shape[5];
        sh2[0] = new Circle(5);
        sh2[0].setColor("Blue");
        System.out.println(sh2[0].getColor());

//        Cast (neindicat)
        ((Circle)sh2[0]).printCircle();
        Circle[] circ2 = { new Circle(1), new Circle(2)};
        circ2[0].printCircle();

//         Metoda 1 - "s"  ia pe rand cate o valoare - s-square / s-triangle / s-circle
//        parcurge intreg array-ul, element cu element
        for (Circle s : circ2){
            s.printShape();
        }

//        Metoda 2 - index - iteratie partiala

        for(int i=0; i< circ2.length; i++){
            circ2[i].printShape();
        }

//        nu este indicat sa folosesc fara <> pentru ca pot sa adaug ce vreau, trebuie limitat (elemente de acelasi tip)
        ArrayList l = new ArrayList();
        l.add(new Circle(5));
        l.add("Ana");
        l.add("are");
        l.add("mere");
//        l.add(2); exemplu
//
//        for(Object s : l){
//            s.toString();
//        }
        System.out.println(circ2);
        System.out.println(l);

        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("java");

        ArrayList<String> myList = new ArrayList<>();
        myList.add("alex");
        myList.add(1,"alex");
        myList.addAll(myList2);
//        myList.clear(); - sterge elementele din lista
        System.out.println(myList.size());
//        myList.remove(1);
        Iterator it = myList.iterator();
//        recomandat sa folosim for (tineti apasat pe while)
        while (it.hasNext()){
            System.out.println(it.next());
        }




        ArrayList<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(7));
        for(Circle c: circleList){
            c.printCircle();
        }

        HashSet<String> hasSet1 = new HashSet<>();
        hasSet1.add("alex");
//        nu pot fi duplicate - will not be added since it is duplicated
        hasSet1.add("alex");
        System.out.println(hasSet1.size());


//        conversie myList (lista cu valori duplicate) in HashSet (valori unice)

       hasSet1.addAll(myList);

//       varianta cu for in care printez de fiecare data
//       for (String s : hasSet1){
//           System.out.println(s);
//       }

//        varinta generica scrisa in utils pentru a usura scrierea
        Utils.printList(hasSet1);

HashMap <Integer, String> myHashmap = new HashMap<>();
myHashmap.put(1, "alex");
myHashmap.put(2, "java");
myHashmap.put(3, "intelliJ");
Utils.printMap(myHashmap);


// Cate caractere sunt intr-un text?
        String text = "Ana are mere si pere si caise si coacaze. Este sezonul, deci vor fi toate gustoase";
        Utils.printMap(Utils.countCharsInText(text));
        System.out.println(Browsers.FIREFOX);

        Catalogue myCatalogue = new Catalogue();
        myCatalogue.addStudent("Alex G", 7.0);
        myCatalogue.addStudent("Bogdan T", 9.0);
        myCatalogue.addStudent("Miruna C", 9.5);
        myCatalogue.addStudent("Andrei A", 4.0);

        myCatalogue.printStudents();
        myCatalogue.searchStudent("Alex A");
        myCatalogue.searchStudent("Alex G");

        myCatalogue.deleteStudent("Alex G");
        myCatalogue.orderStudentsName();
        myCatalogue.orderStudentsGrade();
    }
}
