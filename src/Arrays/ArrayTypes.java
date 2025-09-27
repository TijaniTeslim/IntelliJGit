package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayTypes {
    public static void main(String[] args) {
        double [] myDoubleArray = new double[9];
        myDoubleArray[7] = 3.9;

        int [] myIntArray = new int[10];
        myIntArray[9] = 15;
        int[] myList = new int[]{1,2,3,4,5,6};

        int[] myNewArray;
        myNewArray = new int[] {1,2,3,4,5};
        for (int j : myNewArray) {
            System.out.println(j + " ");

        }

        System.out.println();
        int[] otherArray = {8,7,6,5,4,3,2,1};
        for (int sorter : otherArray) {
            System.out.println(sorter + " ");
        }

        System.out.println(Arrays.toString(otherArray));
        int[] firstTest = getNumbers(10);
        System.out.println(Arrays.toString(firstTest));
        Arrays.sort(firstTest);
        System.out.println(Arrays.toString(firstTest));

        int[] secondArray = new int[10];
        Arrays.fill(secondArray,9);
        System.out.println(Arrays.toString(secondArray));

        int[] newArray = getNumbers(10);
        int[] copyOfArrays = Arrays.copyOf(newArray,9);
        System.out.println(Arrays.toString(copyOfArrays));

        int[] anotherArray = getNumbers(15);
        Arrays.sort(anotherArray);
        System.out.println(Arrays.toString(anotherArray));
        if (Arrays.binarySearch(anotherArray,10) >= 0) {
            System.out.println("the specified number 10 was found");
            System.out.println(Arrays.toString(anotherArray));
        }
        else {
            System.out.println("sorry the number could not be found");
            System.out.println(Arrays.toString(anotherArray));
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5,6};

        if (Arrays.equals(s1,s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("they are not equal");
        }

    }



    private static int[] getNumbers(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0;i < len;i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
