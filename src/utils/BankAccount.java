package utils;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private double amount;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance + "  Deposit: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Balance: " + balance + "  Withdraw: " + amount);
    }

    public void showBalance() {
        System.out.println("El balance es de: " + balance);
    }

}
