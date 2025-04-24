public class LightSwitch {

    static boolean isLightOn = false;

    // Method to turn the light on
    public static void turnOn() {
        isLightOn = true;
        System.out.println("The light is ON.");
    }

    // Method to turn the light off
    public static void turnOff() {
        isLightOn = false;
        System.out.println("The light is OFF.");
    }

    // Method to check light status
    public static void checkStatus() {
        if (isLightOn) {
            System.out.println("Light status: ON");
        } else {
            System.out.println("Light status: OFF");
        }
    }

    public static void main(String[] args) {
        checkStatus();  // OFF by default
        turnOn();       // Turn light ON
        checkStatus();  // Should be ON
        turnOff();      // Turn it OFF
        checkStatus();  // Should be OFF
    }
}
