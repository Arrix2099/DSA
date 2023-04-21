//Static Array 2D

public class A1{
    public static void main(String args[]) {
        int arr[][]={{6,7,4},{5,8,9}, {1,2,4}};
        System.out.println("Elements are : ");
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}