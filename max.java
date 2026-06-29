import java.util.Scanner;

public class max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element = " + max(arr));
  
    }
    static int max(int[] arr)
    {
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>maxVal)
            {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
