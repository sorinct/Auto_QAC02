package oop3;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listaex {
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList<>();
        myFirstList.add("red");
        myFirstList.add("blue");
        myFirstList.add("pink");
        myFirstList.add("black");
        myFirstList.add("purple");
        System.out.println(myFirstList);
        myFirstList.set(2,"yellow");
        System.out.println(myFirstList);
        if (myFirstList.contains("white")) {
            System.out.println("Found the element - ");
        } else {
            System.out.println("There is no such element.");
        }


        List<String> mySecondList = new ArrayList<>();
        mySecondList.add("A");
        mySecondList.add("B");
        mySecondList.add("C");
        mySecondList.add("D");
        mySecondList.add("E");
        System.out.println(mySecondList);
        String element = mySecondList.get(2);
        System.out.println("Third element : " + element);

        Collections.copy(myFirstList, mySecondList);
        System.out.println("After copy :" + myFirstList);
        System.out.println("After copy :" + mySecondList);
//        Collections.shuffle(mySecondList);
//        System.out.println("Shuffle list : " + mySecondList);
        Collections.reverse(mySecondList);
        System.out.println("Reverse : " + mySecondList);
        List<String> myThirdList = mySecondList.subList(0,2);
        System.out.println(myThirdList);

//        let join above two list
        ArrayList<String> twoList = new ArrayList<>();
        twoList.addAll(myFirstList);
        twoList.addAll(mySecondList);
        System.out.println("Join two list : " + twoList);
        twoList.removeAll(twoList);
        System.out.println("Array list after remove all elements." + twoList);
        System.out.println("Checking the above array list is empty or not!" + twoList.isEmpty());
        System.out.println("Checking the above array list is empty or not!" + myFirstList.isEmpty());

//        Print using index of an element
        int numberElements = mySecondList.size();
        for ( int index = 0; index < numberElements; index++) {
            System.out.println(mySecondList.get(index));
        }
    }
}
