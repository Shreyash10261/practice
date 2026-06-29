import java.util.Scanner;

class LN
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int x=sc.nextInt();
        int ans=linSearch(nums,x);
        System.out.println(ans);
    }
    static int linSearch(int[] arr, int x)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[[i]]==x)
            {
                return i;
            }
        }
        return -1;
    }
}
