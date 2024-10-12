import java.util.*;
class Employee
{
String name;
int salary, year,yos;
void getdata()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter your name");
name=s.next();
System.out.println("Enter your salary");
salary=s.nextInt();
System.out.println("Enter your hire year");
year=s.nextInt();
}
int yearsofservice()
{
return 2024-year;
}
void display()
{
System.out.println("Your total name is:"+name+",your salary is"+salary+" and your years of service is:"+yos);
}
}
public class aahana
{
public static void main(String[] args)
{
Employee e1= new Employee();
e1.getdata();
e1.yos = e1.yearsofservice();
e1.display();
}
}