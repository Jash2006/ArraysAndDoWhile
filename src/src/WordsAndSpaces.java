package src;

import java.util.Scanner;

public class WordsAndSpaces {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your sentence ");
        String sentence=scanner.nextLine();
        int a=1;
        for( int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                a++;
            }
        }
        System.out.println("Total number of words in the sentence is " + a);
        System.out.println("Total number of spaces in the sentence is " + (a-1));

    }
}
