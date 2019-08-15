package src;

import java.util.Scanner;

public class EvenOddAndTotal {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter any five digit number " );
        int number=scanner.nextInt();
        scanner.nextLine();
        int rem;
        int oddno=0;
        int evenno=0;
        int oddsum=0;
        int evensum=0;
        while(number>0){
            rem= number%10;
            number=number/10;
            if((rem%2)==0){
                evensum= evensum + rem;
                evenno = evenno +1;    }
            else{
                oddsum = oddsum +rem;
                oddno = oddno +1;
            }
        }
        System.out.println("Total number of even digits are:  "+ evenno);
        System.out.println("The sum  of even digits is:  "  + evensum);
        System.out.println("Total number of odd digits are:  " + oddsum);
        System.out.println("The sum of even digits is:  " + oddno);

    }

}
