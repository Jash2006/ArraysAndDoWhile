package src;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("My original array is: " + Arrays.toString(a));
        System.out.println("Enter your element");
        int ele  = scanner.nextInt();
        System.out.println("Enter your desired position between 1 and " + a.length);
        int pos = scanner.nextInt();

        for(int i=a.length-1;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]= ele;

        System.out.println("So new array is: " + Arrays.toString(a));

    }
}