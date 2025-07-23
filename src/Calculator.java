import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double finalResult = myCalculator();
        System.out.println("the output for your calculation x and y is " + finalResult);
//        double secondCalResult = mySecondCal();
//        System.out.println("the output on your calculation is");
    }

    public static double myCalculator() {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        boolean validInput = false;

        while (!validInput) {
            try{
                System.out.println("type in a number x = ");
                double x = Integer.parseInt(scanner.nextLine());
                System.out.println("type in another number y = ");
                double y = Integer.parseInt(scanner.nextLine());
                System.out.println("choose a specific action : add,subtract,divide ,etc.");
                String action = scanner.nextLine();
                validInput = true;

                switch (action) {
                    case "add" ->
                        result = x + y;
                    case "subtract" ->
                        result = x - y;

                    case "multiply" ->
                        result = x * y;

                    case "divide" ->
                        result = x / y;

                    case "power" ->
                        result = Math.pow(x,y);
                }

            }catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            }
        }

        scanner.close();

        return result;
    }

//    public static double mySecondCal() {
//        Scanner mycal = new Scanner(System.in);
//        double result = 0;
//        boolean validInput = false;
//        do {
//            try {
//                System.out.println("input a number");
//                double firstNumber = Integer.parseInt(mycal.nextLine());
//                System.out.println("choose an action ,sqrt,square");
//                String action = mycal.nextLine();
//                validInput = true;
//                switch (action) {
//                    case "sqrt" ->
//                            result = Math.sqrt(firstNumber);
//                    case "square" ->
//                            result = Math.pow(firstNumber, 2);
//                }
//            }catch (NumberFormatException e) {
//                System.out.println("type in a number");
//            }
//        } while (!validInput);
//        return  result;
//    }
//

}
