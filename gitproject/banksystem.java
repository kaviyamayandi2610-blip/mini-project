import java.util.Scanner;

class Bank {

    String holderName;
    String accountNumber;
    double balance;

    Bank(String holderName, String accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("\n========== Account Details ==========");
        System.out.println("Account Holder : " + holderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class banksystem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bank Management System =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Bank customer = new Bank(name, accNo, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        customer.deposit(deposit);

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();
        customer.withdraw(withdraw);

        customer.display();

        sc.close();
    }
}