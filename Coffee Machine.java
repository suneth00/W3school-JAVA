public class CoffeeMachine {

    // Method to display menu
    public static void showMenu() {
        System.out.println("Welcome to the Coffee Machine!");
        System.out.println("1. Espresso");
        System.out.println("2. Cappuccino");
        System.out.println("3. Latte");
    }

    // Method to make coffee
    public static void makeCoffee(String coffeeType) {
        System.out.println("Preparing your " + coffeeType + "...");
        System.out.println(coffeeType + " is ready! Enjoy ☕");
    }

    public static void main(String[] args) {
        showMenu();                      // Show coffee options
        makeCoffee("Cappuccino");        // Make a cappuccino
    }
}
