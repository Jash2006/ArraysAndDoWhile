package src;

public class SumOfArrays
{
    public static void main(String[] args)
    {
        int[]a={23,45,67,98,54};
        int t = 0;
        for(int i = 0; i < a.length ; i++)
        {
            t = t + a[i];
        }
        System.out.println("The sum of the arrays is= "+ t);
    }

}
