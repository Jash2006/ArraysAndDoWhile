package src;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int i = 1;
        int sum = 0;
        System.out.print("The nutural numbers for given number are: " );
        do {
            System.out.print(i+" ");
            i++;
        }
        while (i <= num);
        System.out.println();
        for (i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the natural numbers upto " + num+ " is " + sum);

    }
}