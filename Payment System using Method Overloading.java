class Payment {

    // Pay by Cash
    void pay(double amount) {
        System.out.println("Paid $" + amount + " by Cash.");
    }

    // Pay by Card
    void pay(String cardNumber, double amount) {
        System.out.println("Paid $" + amount + " using Card Number: " + cardNumber);
    }

    // Pay by Digital Wallet
    void pay(String walletName, String phoneNumber, double amount) {
        System.out.println("Paid $" + amount + " using " + walletName + " wallet linked to Phone: " + phoneNumber);
    }

    // Pay by Cheque
    void pay(double amount, int chequeNumber) {
        System.out.println("Paid $" + amount + " using Cheque No: " + chequeNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.pay(100.0);                                // Cash Payment
        payment.pay("1234-5678-9012-3456", 250.0);         // Card Payment
        payment.pay("PayPal", "9876543210", 75.5);         // Wallet Payment
        payment.pay(500.0, 112233);                        // Cheque Payment
    }
}
