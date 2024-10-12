import java.util.Scanner;

public class InputOutputOperations {

    // 21. Take input from the user and display it
    public static void displayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }

    // 22. Input a string and print its length
    public static void printStringLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Length of the string: " + input.length());
    }

    // 23. Take an integer array as input and print its elements
    public static void printArrayElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // 24. Input two numbers and find their sum
    public static void findSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    // 25. Input the radius of a circle and calculate its area
    public static void calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    // 26. Take multiple inputs and calculate their average
    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        double sum = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            sum += scanner.nextDouble();
        }
        double average = sum / n;
        System.out.println("Average: " + average);
    }

    // 27. Input a sentence and count the number of words
    public static void countWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    // 28. Input a string and print its reverse
    public static void printReverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    // 29. Input a matrix and print its transpose
    public static void printTranspose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Transpose of the matrix: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    // 30. Input a number and print its binary representation
    public static void printBinaryRepresentation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binary);
    }

    public static void main(String[] args) {
        // Example usage
        printStringLength();
    }
}