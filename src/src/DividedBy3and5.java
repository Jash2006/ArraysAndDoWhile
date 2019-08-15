package src;

import java.util.Scanner;

public class DividedBy3and5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to find out the numbers divided by 3 and 5 ");
        int  limit=sc.nextInt();
        System.out.print("Numbers divisible by 3 are: ");
        for(int i=1;i<=limit;i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
         System.out.print("Numbers divisible by 5 are: ");
            for(int j=1;j<=limit;j++){
                if(j%5==0){

                    System.out.print( " "+ j);
                }
            }

    }
}
