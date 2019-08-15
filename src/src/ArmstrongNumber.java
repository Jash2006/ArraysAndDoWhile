package src;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter the number.");
        int num= scanner.nextInt();
        int number;
        int sum=0;
        int rem;
        number=num;

        while(num!=0){
           rem= num % 10;
           num= num/10;
           sum= sum + (rem*rem*rem);
        }

        if(sum==number){
            System.out.println("The number is Armstrong number");
        }
        else{
            System.out.println("The number is not Armstrong number");
        }


    }
}
