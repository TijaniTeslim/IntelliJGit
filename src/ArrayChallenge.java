import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] testNow = createArray(10);
        Arrays.sort(testNow);
        System.out.println("the original array is = " + Arrays.toString(testNow));

        Collections.reverse(Arrays.asList(testNow));
        System.out.println("the reversed version is = " + Arrays.toString(testNow));

        Integer[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(myArray));

        // Convert the array to a List and reverse it
        Collections.reverse(Arrays.asList(myArray));

        System.out.println("Reversed Array: " + Arrays.toString(myArray));
    }

    private static int[] createArray(int lent) {
        Random random = new Random();
        int [] newArray = new int[lent];
        for (int i = 0;i < lent;i++) {
            newArray[i] = random.nextInt(101);
        }

        return newArray;
    }
}
