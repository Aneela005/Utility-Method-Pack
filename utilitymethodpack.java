import java.util.Scanner;

public class utilitymethodpack {

    
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static int subtract(int a, int b) {
        return a - b;
    }

   
    public static long multiply(int a, int b) {
        return (long) a * b;
    }

 
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return (double) a / b;
    }


    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        // Input three numbers for maxOfThree
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        System.out.println("Maximum of three: " + maxOfThree(a, b, c));

        // Check if a number is prime
        System.out.print("Enter a number to check for prime: ");
        int num = scanner.nextInt();
        System.out.println("Is " + num + " prime? " + isPrime(num));

        scanner.close();
    }
}
