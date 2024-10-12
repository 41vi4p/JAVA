import java.util.*;

abstract class staffs
{
    String name=" ";
    String Address=" ";
    abstract void read();
    abstract void display();
}
class teacher extends staffs
{
    String subject=" ";
    String publication=" ";
    void read()
    {
        Scanner s= new Scanner(System.in);
        name=s.nextLine();
        Address=s.nextLine();
        subject=s.nextLine();
        publication=s.nextLine();
    }
    void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Address is "+Address);
        System.out.println("Subject is "+subject);
        System.out.println("Publication is "+publication);
    }

}
interface typist extends staffs
{
    int speed;
    void read()
    {
        Scanner s= new Scanner(System.in);
        speed=s.nextInt();
    }
    void display()
    {
        System.out.println("Speed is "+speed);
    }
}

class officer extends staffs
{
    String grade=" ";
    void read()
    {
        Scanner s= new Scanner(System.in);
        name=s.nextLine();
        Address=s.nextLine();
        grade=s.nextLine();
    }
    void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Address is "+Address);
        System.out.println("Grade is "+grade);
    }
}

class regular implements typist
{
    int salary;
    if (speed >100 && speed <150)
    {
        salary=15000;
    }
    else if(speed >150 && speed <200)
    {
        salary=20000;
    }
    else
    {
        salary=25000;
    }
    void display()
    {
        System.out.println("Salary is "+salary);
    }
}

class dailywages implements typist
{
    int dailywages;
    void read()
    {
        Scanner s= new Scanner(System.in);
        dailywages=s.nextInt();
    }
    void display()
    {
        System.out.println("Daily wages is "+dailywages);
    }
}


public class staff {
    
}
