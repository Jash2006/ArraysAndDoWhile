package src;

import java.util.Arrays;

public class SortArray {
    public static void main(String[]args) {
        int[]n = {3, 7, 78, 45, 34};
        System.out.println("The original order of array is "+ Arrays.toString(n));
        Arrays.sort(n);
        System.out.println("And after sorting the order is " + Arrays.toString(n));
        String[] city = {"London", "Delhi", "Sydney", "Mumbai"};
        System.out.println("The original order of array is "+ Arrays.toString(city));
        Arrays.sort(city);
        System.out.println("And after sorting the order is " + Arrays.toString(city));

    }
}
