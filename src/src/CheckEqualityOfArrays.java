package src;

public class CheckEqualityOfArrays {
    public static boolean equals(int[]a,int[]b){
        if(a.length!=b.length)
            return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args) {
        int arr1[] = {1, 2, 3, 4,7};
        int arr2[] = {1, 2, 3, 4};

        if(equals(arr1,arr2))
                 {System.out.println("Matching Arrays");}
        else{
            System.out.println("Different Arrays");
        }
    }
}
