public class DecisionAndLoopingStatements {

    // 1. Check if a number is even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    // 2. Find the largest of three numbers
    public static void findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }

    // 3. Check if a year is a leap year
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // 4. Calculate the factorial of a number
    public static void calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    // 5. Print the multiplication table of a given number
    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    // 6. Reverse a number
    public static void reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    // 7. Check if a number is a palindrome
    public static void checkPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    // 8. Print the Fibonacci series up to a certain number
    public static void printFibonacci(int limit) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int next = a + b;
        while (next <= limit) {
            System.out.print(" " + next);
            a = b;
            b = next;
            next = a + b;
        }
        System.out.println();
    }

    // 9. Find the sum of the digits of a number
    public static void sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // 10. Print all prime numbers between two numbers
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 11. Check if a character is a vowel or consonant
    public static void checkVowelConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }

    // 12. Print a triangle pattern
    public static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 13. Find the GCD of two numbers
    public static void findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is " + a);
    }

    // 14. Find the sum of the first n natural numbers
    public static void sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }

    // 15. Calculate the power of a number
    public static void calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }

    // 16. Check if a number is an Armstrong number
    public static void checkArmstrong(int number) {
        int original = number, sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }

    // 17. Print all the factors of a given number
    public static void printFactors(int number) {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 18. Implement a number guessing game
    public static void guessNumberGame(int numberToGuess) {
        // This method is a placeholder for the game logic
        System.out.println("Guess the number game is not implemented in this example.");
    }

    // 19. Print the first n even numbers
    public static void printFirstNEvenNumbers(int n) {
        System.out.print("First " + n + " even numbers: ");
        for (int i = 1, count = 0; count < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }

    // 20. Print a pyramid pattern of stars
    public static void printStarPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example: Print the multiplication table of 5
        printMultiplicationTable(5);
    }
}