public class MethodExample {

    // This method takes two int parameters and prints their sum
    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    // This method takes a String parameter and prints a greeting
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Calling method with integer parameters
        addNumbers(5, 10);

        // Calling method with a string parameter
        greet("Alice");
    }
}
