import java.util.Scanner;

//Largest element in an array
public class p41 {
    public static void main(String[] args) {
        int size;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size; i++)
        {
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        for(int i=1; i<size; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: "+max);
    }
}
