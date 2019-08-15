package src;

import java.util.Scanner;

public class CountTotalA {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the name of your city or last name");
        String name= scanner.nextLine();
        char c ='a';
        System.out.println("The total count of a in provided name is ");
        int a =0;
        for(int i=0;i< name.length();i++){
            if(c==name.charAt(i)){
                a++;
            }
        }
        System.out.println(a);
    }

}
