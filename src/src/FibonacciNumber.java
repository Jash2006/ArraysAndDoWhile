package src;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int limit= scanner.nextInt();
        int num1=0;
        int num2= 1;
        int num3;
        System.out.print("The Fibonacci Sequence: "+ num1 +" "+num2 +" ");
        for(int i=2;i<=limit;i++){
            num3= num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
        }


    }

}
