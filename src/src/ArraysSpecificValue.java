package src;

import java.util.Scanner;

//this program allows user to check whether the arrays contain the input value or not.
public class ArraysSpecificValue {
    public static void main(String[] args) {
        int[] a = {23, 45, 21, 68, 90};
        System.out.println("Enter the number");
        Scanner scanner= new Scanner(System.in);
        int b= scanner.nextInt();
        int i;
        for ( i = 0; i < a.length; i++)
        {
        if (a[i]==b)
        { System.out.println("Arrays contains this value and its index position is "+ i );}

        }

    }
}


