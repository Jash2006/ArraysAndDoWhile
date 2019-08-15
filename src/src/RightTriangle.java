package src;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the character ");
        char c= scanner.next().charAt(0);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
