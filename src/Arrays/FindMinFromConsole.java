package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinFromConsole {
    public static void main(String[] args) {
        int[] test = readIntegers();
        findMin(test);
        System.out.println(Arrays.toString(test));
        Reverse(test);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a long number");
        int number = scanner.nextInt();
        String myNums = String.valueOf(number);

        int[] numberArray = new int[myNums.length()];
        for (int i = 0;i < myNums.length();i++) {
            numberArray[i] = Character.getNumericValue(myNums.charAt(i));
        }

        System.out.println("Digits array : " + Arrays.toString(numberArray));
        return numberArray;
    }

    private static int findMin(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("the min number is " + min);
        return min;
    }
    private static void Reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length;i++) {
            reversed[i] = array[(array.length - 1) - i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
