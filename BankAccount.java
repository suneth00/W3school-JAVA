public class BankAccount {

    // Instance Variables
    String accountHolderName;
    double balance;

    // Static Variable (Same for all accounts)
    static String bankName = "ABC Bank";

    public static void main(String[] args) {

        // First Account
        BankAccount acc1 = new BankAccount();
        acc1.accountHolderName = "John";
        acc1.balance = 5000.00;

        // Second Account
        BankAccount acc2 = new BankAccount();
        acc2.accountHolderName = "Emma";
        acc2.balance = 8000.50;

        // Print Account Details
        System.out.println(acc1.accountHolderName + " has $" + acc1.balance + " in " + bankName);
        System.out.println(acc2.accountHolderName + " has $" + acc2.balance + " in " + bankName);
    }
}
