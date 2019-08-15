package src;

import java.util.Scanner;

public class FiveDigitNumSum {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any five digit number");
        int amount= scanner.nextInt();
        int rem;
        int sum;
        System.out.print(" The sum of all digits = ");
        for( sum=0 ;amount>0; amount= amount/10 ){
            rem= amount%10;
            sum=sum+ rem ;
        }
        System.out.println(sum);
    }
}
