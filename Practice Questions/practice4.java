import java.util.*;
class Student
{
    String name;
    int roll_no;
    String div;
    String branch;
    int phy, chem, math;
    float percetage(int phy,int chem, int math)
    {
        float result= (phy+chem+math)/3;
        return result;

    }
            void getdata()
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the name of the student");
                name = sc.nextLine();
                System.out.println("Enter the roll number of the student");
                roll_no = sc.nextInt();
                System.out.println("Enter the division of the student");
                div = sc.next();
                System.out.println("Enter the branch of the student");
                branch = sc.next();
                System.out.println("Enter the marks in Physics");
                phy = sc.nextInt();
                System.out.println("Enter the marks in Chemistry");
                chem = sc.nextInt();
                System.out.println("Enter the marks in Mathematics");
                math = sc.nextInt();
            }
            void display()
            {
                System.out.println("Name: "+name);
                System.out.println("Roll Number: "+roll_no);
                System.out.println("Division: "+div);
                System.out.println("Branch: "+branch);
                System.out.println("Physics: "+phy);
                System.out.println("Chemistry: "+chem);
                System.out.println("Maths: "+math);
            }
}

public class practice4
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.getdata();
        float result = s1.percentage();
        s1.display();
    }
}