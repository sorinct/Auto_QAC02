package courses.java.intro;

public class Exercises {
    public static void main(String[] args) {
//        Compute the average of first N numbers from 1 to N
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("average is :" + ((float) sum / n));
        } else {
            System.out.println("Please provide N as argument");
        }
        int[] numbers = {33, 2, 22, 4, 5, 63, 7, 8, 9, 10};
        System.out.println(numbers[2]);

        }
    }

