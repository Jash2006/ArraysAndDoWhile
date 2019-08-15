package src;

import java.util.Scanner;

public class ReverseTheNum {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the five digit number");
        int num= scanner.nextInt();
        int rev = 0;
        while(num!=0){
            rev=rev*10;
            rev=rev + (num%10);
            num=num/10;
        }
        System.out.println( "The reverse number is: " + rev);

    }
}
