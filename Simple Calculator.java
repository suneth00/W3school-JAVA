public class SimpleCalculator {

    public static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    public static void main(String[] args) {
        add(5, 3);
        subtract(10, 4);
        multiply(6, 2);
    }
}
