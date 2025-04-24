public class TemperatureChecker {

    // Method to check if it's hot or cold
    public static void checkTemperature(int temp) {
        if (temp >= 30) {
            System.out.println("It's hot outside!");
        } else if (temp >= 15) {
            System.out.println("The weather is nice.");
        } else {
            System.out.println("It's cold outside!");
        }
    }

    public static void main(String[] args) {
        checkTemperature(10
