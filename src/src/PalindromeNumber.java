package src;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int number;
        number=num;
        int rem=0;
        while(num>0){
            rem= rem *10;
            rem= rem + (num%10);
            num= num/10;
        }
        if(rem==number){
            System.out.println("The number is Pelindrome number");
        }
        else{
            System.out.println("The number is not a Pelindrome number");
        }
    }
}
