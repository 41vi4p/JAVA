// 51. Class Student
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

// 52. Calculate average marks of students
double calculateAverageMarks(Student[] students) {
    double total = 0;
    for (Student student : students) {
        total += student.marks;
    }
    return total / students.length;
}

// 53. Sort an array of Book objects by price
void sortBooksByPrice(Book[] books) {
    Arrays.sort(books, Comparator.comparingDouble(book -> book.price));
}

// 54. Find the Employee with the highest salary
Employee findHighestSalary(Employee[] employees) {
    Employee highestPaid = employees[0];
    for (Employee emp : employees) {
        if (emp.salary > highestPaid.salary) {
            highestPaid = emp;
        }
    }
    return highestPaid;
}

// 55. Display products above a certain price
void displayProductsAbovePrice(Product[] products, double price) {
    for (Product product : products) {
        if (product.price > price) {
            System.out.println(product.name + " - $" + product.price);
        }
    }
}

// 56. Search for a Person by name
Person searchPersonByName(Person[] persons, String name) {
    for (Person person : persons) {
        if (person.name.equals(name)) {
            return person;
        }
    }
    return null; // Not found
}

// 57. Update details of an object in an array
void updateStudentDetails(Student[] students, String name, int newMarks) {
    for (Student student : students) {
        if (student.name.equals(name)) {
            student.marks = newMarks;
            break;
        }
    }
}

// 58. Find the oldest vehicle
Vehicle findOldestVehicle(Vehicle[] vehicles) {
    Vehicle oldest = vehicles[0];
    for (Vehicle vehicle : vehicles) {
        if (vehicle.year < oldest.year) {
            oldest = vehicle;
        }
    }
    return oldest;
}

// 59. Find the total price of all products
double calculateTotalPrice(Product[] products) {
    double totalPrice = 0;
    for (Product product : products) {
        totalPrice += product.price;
    }
    return totalPrice;
}

// 60. Display all students with marks above a certain threshold
void displayStudentsAboveThreshold(Student[] students, int threshold) {
    for (Student student : students) {
        if (student.marks > threshold) {
            System.out.println(student.name + " - Marks: " + student.marks);
        }
    }
}