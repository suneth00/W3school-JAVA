public class SimpleSuite {

    static boolean isBooked = false;

    // Method to check if suite is available
    public static void checkAvailability() {
        if (isBooked) {
            System.out.println("Suite is already booked.");
        } else {
            System.out.println("Suite is available.");
        }
    }

    // Method to book the suite
    public static void bookSuite() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Suite has been successfully booked!");
        } else {
            System.out.println("Cannot book. Suite is already taken.");
        }
    }

    public static void main(String[] args) {
        checkAvailability();  // Check if suite is available
        bookSuite();          // Book the suite
        checkAvailability();  // Check again
    }
}
