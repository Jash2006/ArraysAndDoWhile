package src;

public class FindDuplicateValueArrays {
    public static void main(String[]args){
        int arr[]= {1,3,5,3,6,7,8,4,6,8,};
        System.out.println("The duplicate values in Arrays are: ");
        for( int i= 0; i<arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]==arr[j] ){
                    System.out.println(arr[j]);
                }
            }
        }


    }
}
