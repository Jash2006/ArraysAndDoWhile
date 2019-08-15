package src;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int ele = scanner.nextInt();
        int a[]= new int[ele];
        System.out.println("Now enter the elements in the Arrays");
        for(int i=0;i<a.length;i++)
        {  a[i]=scanner.nextInt();}

        System.out.println("The reverse order of this Arrays is");
        for( int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }

    }
}
