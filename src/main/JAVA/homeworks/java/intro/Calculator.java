package homeworks.java.intro;
// Implement an arithmetic calculator that takes 3 arguments:
//the first number, the operation, the second number and displays the result

public class Calculator {
    public static void main(String[] args) {
        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
            float result = 0;
            switch (operator) {
                case "+":
                    result = a + b;
                  break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "%":
                    result = a % b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("B can't be zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Use +, -, *, % or / .");
                    return;
            }
            System.out.println("The result is: " + result);
        } else {
            System.out.println("3 arguments are needed!");
        }
    }
}
