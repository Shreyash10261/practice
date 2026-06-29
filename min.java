import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum element = " + min(arr,n));
    }
    static int min(int[]arr,int n)
    {
        int ans=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<ans)
            {
                ans=arr[i];
            }
        }
        return ans;
    }
        
}
