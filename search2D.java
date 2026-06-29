import java.util.*;
public class search2D {
    public static void main(String[] args) {
        int[][] arr={
            {23,42,555,67},
            {22,32,11},
            {22,44,3,11,77},
            {33,6,22,90}
        };
        int target=11;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
        static int[] search(int[][] arr,int target)
        {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    if(arr[i][j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};
        }
}
