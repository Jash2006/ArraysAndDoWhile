package src;

public class Transpose2dArays {
    public static void main(String[]args){
        int original[][]={{1,2,3,4,100},{4,5,6,4,200},{7,8,9,10,300},{11,12,13,14,400},{21,31,41,51,61,}};
        System.out.println("The original Matrix is ");
        for(int i=0;i<original.length;i++){
            for(int j=0;j<original.length;j++)
                System.out.print(original[i][j] + "  ");
            System.out.println();
        }
        int transpose[][]= new int[original.length][original.length];
        for(int i=0;i<original.length;i++){
            for(int j=0;j<original.length;j++){
                transpose[i][j]=original[j][i];
;            }
        }
        System.out.println("The transpose Matrix is ");
        for(int i=0;i<original.length;i++){
            for(int j=0;j<original.length;j++)
                System.out.print(transpose[i][j] + "  ");
            System.out.println();
        }

    }
}
