// 31. Person class
class Person {
    String name;
    int age;
    char gender;

    // Constructor
    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}

// 32. Student class
class Student {
    int rollNumber;
    double marks;

    // Constructor
    Student(int rollNumber, double marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }
}

// 33. Circle class
class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// 34. Car class
class Car {
    String make;
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

// 35. Rectangle class
class Rectangle {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 36. BankAccount class
class BankAccount {
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// 37. Book class
class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

// 38. Employee class
class Employee {
    String name;
    String designation;
    double salary;

    // Constructor
    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Method to give a raise
    void giveRaise(double amount) {
        salary += amount;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name: " + name + ", Designation: " + designation + ", Salary: $" + salary);
    }
}

// 39. Point class
class Point {
    double x;
    double y;

    // Constructor
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate distance between two points
    double calculateDistance(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }
}

// 40. ComplexNumber class
class ComplexNumber {
    double real;
    double imaginary;

    // Constructor
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber another) {
        return new ComplexNumber(this.real + another.real, this.imaginary + another.imaginary);
    }

    // Method to subtract two complex numbers
    ComplexNumber subtract(ComplexNumber another) {
        return new ComplexNumber(this.real - another.real, this.imaginary - another.imaginary);
    }

    // Method to multiply two complex numbers
    ComplexNumber multiply(ComplexNumber another) {
        double newReal = this.real * another.real - this.imaginary * another.imaginary;
        double newImaginary = this.real * another.imaginary + this.imaginary * another.real;
        return new ComplexNumber(newReal, newImaginary);
    }
}