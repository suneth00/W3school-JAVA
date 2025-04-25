public class StepCounter {

    static int steps = 0;

    public static void walk(int newSteps) {
        steps += newSteps;
        System.out.println("You walked " + newSteps + " steps. Total: " + steps);
    }

    public static void resetSteps() {
        steps = 0;
        System.out.println("Step count reset.");
    }

    public static void main(String[] args) {
        walk(1000);
        walk(1500);
        resetSteps();
        walk(500);
    }
}
