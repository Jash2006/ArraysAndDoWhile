package src;

import java.util.Scanner;

public class MultiTableOfIntiger {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number for multiplication table");
        int num= scanner.nextInt();
        for(int i=1; i<=5;i++){
            System.out.println( num +"x"+ i+"="+(num*i));
        }
    }
}
