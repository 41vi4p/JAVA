//write a program to find the sum of all elements of an array 43
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 0, sum = 0;
        System.out.println("Enter the size of the array");
        size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("ENter the elements of the array");
        for(int i=0; i<size;i++)
        {
            arr[i] = s.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("The sum of the elements of the array is: "+sum);
    }
    
}
