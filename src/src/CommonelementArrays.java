package src;

public class CommonelementArrays {
    public static void main(String[]args){
        String a[]={"London","Delhi","Mumbai","Banglore","Goa","surat"};
        String b[]={"France","New york","Lahore","Surat","Mumbai","Mosco"};
        System.out.println("The common String elements of 2 Arrays are: ");
        for(int i=0; i<a.length;i++){
            for(int j=0;j<b.length ; j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }

        }
    }

}
