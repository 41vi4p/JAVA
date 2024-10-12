import java.util.*;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Rollno " + rollno + " Name " + name + " Age " + age);
    }

    @Override
    public int compareTo(Student s) {
        return this.rollno - s.rollno;
    }
}

class program45 {
    public static void main(String args[]) {
        // Creating user-defined class objects
        Scanner s = new Scanner(System.in);
        // Student s1 = new Student(103, "Sonoo", 23);
        // Student s2 = new Student(101, "Ravi", 21);
        // Student s3 = new Student(102, "Hanumat", 25);

        ArrayList<Student> al = new ArrayList<Student>();
        System.out.println("HOw many inputs?");
        int n=s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollno = s.nextInt();
            s.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = s.nextLine();
            System.out.print("Age: ");
            int age = s.nextInt();
            s.nextLine(); // Consume newline

            Student student = new Student(rollno, name, age);
            al.add(student); // adding Student class object
        }
        // creating arraylist
        
        // al.add(s1);
        // al.add(s2);
        // al.add(s3);
        Collections.sort(al);
        for (Student j : al) {
            j.display();
        }
    }
}
