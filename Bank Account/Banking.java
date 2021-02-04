package bank.account;

public interface Banking {

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract void transfer(double amount, BankAcc another);
}
