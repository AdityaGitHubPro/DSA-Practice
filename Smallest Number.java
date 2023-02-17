import java.util.*;

public class Main {

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 53, 6, 98, 2, 4, 7 };

        // int largeNumber = getLargest(numbers);
        System.out.println("largest number is " + getSmallest(numbers));
    }
}
