package src;

import java.util.Scanner;

public class FindIndexNumber {
    public static void main(String[]args){
        int[]a={10,20,30,40,50,60};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value");
        int e=scanner.nextInt();
        int i;
        for(i=0;i<a.length;i++)
        {
            if (e == a[i])
                {
                System.out.println("The index number is " + i);
                }
        }

    }

}
