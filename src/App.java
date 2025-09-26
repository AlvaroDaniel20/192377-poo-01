import utils.BankAccount;

public class App {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("040205", 20000);
        BankAccount bankAccount2 = new BankAccount("200425", 150000);

        System.out.println("Account Number: " + bankAccount1.getAccountNumber());
        System.out.println("Account Balance: " + bankAccount1.getBalance());
        System.out.println();

        System.out.println("Account Number: " + bankAccount2.getAccountNumber());
        System.out.println("Account Balance: " + bankAccount2.getBalance());
        System.out.println();

        bankAccount1.deposit(50000);
        System.out.println("Account Balance: " + bankAccount1.getBalance());
        System.out.println();

        bankAccount2.withdraw(2000);
        System.out.println("Account Balance: " + bankAccount2.getBalance());
        System.out.println();


    }
}
