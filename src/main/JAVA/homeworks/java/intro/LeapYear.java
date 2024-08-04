package homeworks.java.intro;

//package homeworks.java.intro;
////1) Display the number of days in month February from a year between 1900-2016 that is read from keyboard
//// (https://www.geeksforgeeks.org/program-check-given-year-leap-year/)
//

public class LeapYear {
    public static void main(String[] args) {
        if (args.length > 0) {
            int year = Integer.parseInt(args[0]);
            if (year >= 1900 && year <= 2016) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println("February has 29 days");
                } else {
                    System.out.println("February has 28 days");
                }
            } else {
                System.out.println("Enter a year between 1900 and 2016.");
            }
        }
    }
}

