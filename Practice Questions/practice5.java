//Write a java program to create a class called 'Employee' with a name, salary and hire date attributes
//and a method to calculate years of service
import java.util.*;
class Employee
{
    String name;
    float salary;
    //hiredate attributes
    int DD,MM,YYYY;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        name = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextFloat();
        System.out.println("Enter hire date (DD MM YYYY):");
        DD = sc.nextInt();
        MM = sc.nextInt();
        YYYY = sc.nextInt();
    }
    int calculateYearsOfService() {
        
        int currentyear = 2024;
        int years_of_service= currentyear - YYYY;
        return years_of_service;
    }
    void display(String name)
    {   this.name=name;
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + DD + "/" + MM + "/" + YYYY);
        System.out.println("Years of Service: " + calculateYearsOfService());
    }

    }

public class practice5
{
    Employee emp = new Employee();
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdata();
        emp.display("david");
    }
}