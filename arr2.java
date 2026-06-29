class arr2
{
    public static void main(String[] args) {
        int[][] arr={
            {1,2,5,6,7},
            {2,7,8,9},
            {6,4,1,7,8,8,99,100},
            {1,2,2,2,2}
        };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}