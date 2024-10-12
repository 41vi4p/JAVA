//0 3 8 15...
//program to generate the above pattern
import java.util.*;;


public class pattern {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        System.out.println("Enter the value for n: ");
        // Scanner s =new Scanner(System.in);
        // n=s.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+"\t");
            // if(a%2==0)
            // {
            //     a=a-1;
            // }
            // if(i%2!=0)
            // {
            //     b=b+2;
            // }
            b=b+2;
            a=a+b;

        }
        System.out.println();
    }
}