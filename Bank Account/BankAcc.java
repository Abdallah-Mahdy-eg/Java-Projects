package bank.account;

public class BankAcc extends Account implements Banking {

    private double balance;

    public BankAcc(Person owner, double balance, String password) {
        super();
        this.balance = balance;
        this.setOwner(owner);
        this.setPassword(password);
        this.addAccToOwner(owner);
    }

    @Override
    void addAccToOwner(Person p) {
        p.getAccounts().add(this);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawing $" + amount);
        } else {
            System.out.println("no enough balance!");
        }
    }

    @Override
    public void transfer(double amount, BankAcc another) {
        if (balance <= amount) {
            another.balance += amount;
            balance -= amount;
            System.out.println("Transferring $" + amount);
        } else {
            System.out.println("no enough balance!");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        String info = this.getOwner().toString();
        return "this account information is " + info + "\n" + "balance = " + balance;
    }

}
