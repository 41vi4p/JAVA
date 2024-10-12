/*
 Create a class student with a constructor that initialises name, roll no, and age of the student
 Write a main method to create the instance of student class
 and print the name, roll no., and age of the student
 */
// import java.util.*;

 class student{
    int rno;
    String name;
    int age;
    
        // Constructor
    student(int rno, String name, int age) {
        this.rno = rno;
        this.name = name;
        this.age = age;
        }
        // Method to display student details
    void display() {
        System.out.println(rno + "\t" + name + "\t" + age);
        }
    }
    

 public class practice7 {
    public static void main(String[] args) {
        student s=new student(10150,"David",19);
        s.display();
        
        
    }
 }
