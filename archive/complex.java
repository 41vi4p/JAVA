/* Create a class complex with suitable data members this class should have:
    - method for taking input
    - method for displaying complex numbers
    - method to add 2 complex numbers
    - method to subtract complex numbers
    - method to multiply complex numbers
*/
import java.util.*;

class complex_class{
    int img,real,res, res_img;

    //method for input
    void getInput(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the real part: ");
            real =sc.nextInt();
            System.out.println();
            System.out.print("Enter the imaginary part: ");
            img = sc.nextInt();
        }
        System.out.println();
        res = real;
        res_img = img;
    }

    //method for displaying 
    void display(){
        System.out.println(res + "+" + res_img + "i");
    }

    void add_Complex(complex_class c1, complex_class c2){
        res = c1.real + c2.real;
        res_img = c1.img + c2.img;
        System.out.println("Addition: "+res+"+"+res_img+"i\n");
    }

    void subtract_Complex(complex_class c1, complex_class c2){
        res = c1.real - c2.real;
        res_img = c1.img - c2.img;
        System.out.println("Subtraction: "+res+"+"+res_img+"i\n");
    }

    void multiply_Complex(complex_class c1, complex_class c2){
        res = (c1.real * c2.real) - (c1.img * c2.img);
        res_img = (c1.real * c2.img) + (c1.img * c2.real);
        System.out.println("Multiplication: "+res+"+"+res_img+"i\n");
    }
    
}

public class complex {
    public static void main(String[] args) {
        complex_class c1 = new complex_class();
        complex_class c2 = new complex_class();
        System.out.println("\nBasic Complex Calculator v0.1\n");
        c1.getInput();
        c2.getInput();
        System.out.print("Complex number 1: ");
        c1.display();
        System.out.print("Complex number 2: ");
        c2.display();
        System.out.println("What Operation do you want to do on the complex numbers?");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println();        
        switch(choice){
            case 1:
                c1.add_Complex(c1, c2);
                break;
            case 2:
                c1.subtract_Complex(c1, c2);
                break;
            case 3:
                c1.multiply_Complex(c1, c2);
                break;

            case 4:
                break;
        
            default:
                System.out.println("Invalid Choice");
        }
    }
    
}
