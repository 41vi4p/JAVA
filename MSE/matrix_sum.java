import java.util.Scanner;

public class matrix_sum {
    public static void main(String args[])
    {
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int[][] res=new int[3][3];
        int i,j;
        Scanner s=new Scanner(System.in);
         System.out.println("Enter matrix 1");
         for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
             {
                 a[i][j]=s.nextInt();
             }
         }
         System.out.println("Enter matrix 2");
         for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
             {
                 b[i][j]=s.nextInt();
             }
         }
        for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
             {
                 res[i][j]=a[i][j]+b[i][j];
             }
         }
         System.out.println("Matrix 1");
         for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
             {
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }
          System.out.println("Matrix 2");
         for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
             {
                 System.out.print(b[i][j]+" ");
             }
             System.out.println();
         }
          System.out.println("Resultant matrix");
         for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
             {
                 System.out.print(res[i][j]+" ");
             }
             System.out.println();
         }
    }
}
