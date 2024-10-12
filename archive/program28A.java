import java.util.*;
class staff
{
    String codename;
    String address;
    staff()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the codename and address");
        codename = s.next();
        address = s.next();
    }
    void display()
    {
        System.out.println(codename+ "    "+ address);
    }
}

class teacher extends staff
{
    Scanner s = new Scanner(System.in);
    String Subject;
    String Publication;
      teacher()
    {
        System.out.println("Enter the subject and publication");
        Subject = s.next();
        Publication = s.next();
    }
   void display()
    {   super.display();
        System.out.println(Subject+ Publication);
    }
   
}
class typist extends staff
{
    Scanner s = new Scanner(System.in);
    float speed;
    typist()
    {  
        System.out.println("Enter the speed for typist");
        speed = s.nextFloat();
           
   
    }
    void display()
     {
        System.out.println(speed);
    }
   
}

class regular extends typist
{
    //float speed= super.speed;
    float salary;
    regular()
    {
        System.out.println("Enter the salary for regular typist");
        salary = s.nextFloat();
    }
    void display()
    {
        System.out.println(salary);
    }
}

class casual extends typist
{   
    //float speed=super.speed;
    float dailywages;
    casual()
    {
        System.out.println("Enter the daily wages for casual typist");
        dailywages = s.nextFloat();
    }
    void display()
    {
        System.out.println(dailywages);
    }
}

class officer extends staff
{
    Scanner s = new Scanner(System.in);
    String grade;
      officer()
    {
        System.out.println("Enter the grade for officer");
        grade = s.next();
   
    }
    void display()
    {
        System.out.println(grade);
    }
   
   
}

public class program28A
{
public static void main(String[] args) 
{
   /*staff s1 = new staff();
   s1.info();
   s1.display();*/
   int option;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the option:1 teacher 2 typist 3 regular 4 casual 5 officer");
    option = s.nextInt();
    switch(option)
    { 
        case 1:
                teacher t1 = new teacher();
                t1.display();
                break;
         case 2:
                typist t2 = new typist();
                t2.display();
                break;
          case 3:
              regular r1 = new regular();
              r1.display();
              break;
        case 4:
            casual c1 = new casual();
            c1.display();
            break;
         case 5:
          officer o1 = new officer();
             o1.display();
             break;
        default:
            System.out.println("Invalid option");
            break;
    }
}
}