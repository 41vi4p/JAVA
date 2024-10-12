//create a class called students having data members having roll number date and age
//create an arrayList of student objects and display it
import java.util.*;

class student
{
    int rno;
    String name;
    int age;
    Date doe;

    student(int rno, String name, Date date, int age) {
        this.rno = rno;
        this.name = name;
        this.doe = date;
        this.age = age;
    }

    void display(){
        System.out.println("Roll No: "+ rno);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Date of joining: "+doe);
    }

}

public class program_arraylist {
    public static void main(String[] args) {
        student s1 =new student(1,"Alice",new Date(13-05-2024),18);
        System.out.println(s1.doe);
       //ArrayList<Student> students= new ArrayList<Student>();
         
        // students.add(new student(1, "John Doe", new doe(), 20));
        // students.add(new student(2, "Jane Smith", new Date(), 22));
        // students.add(new student(3, "Alice Johnson", new Date(), 21));

        

    }
    
}
