package bank.account;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person pr1 = new Person("Mohamed", "618032", "mohamed@gmail.com");
        Person pr2 = new Person("Hassan", "618033", "Hassan@gmail.com");
        BankAcc B1 = new BankAcc(pr1, 5000, "mo1234");
        BankAcc B2 = new BankAcc(pr2, 6000, "hassan23");
        int operations;
        boolean quit = false;
        System.out.println("Welcome to our banck!");
        do {
            System.out.println("To creat press 1 ");
            System.out.println("To deposit press 2 ");
            System.out.println("To withdraw press 3 ");
            System.out.println("To transfer press 4 ");
            System.out.println("To balance press 5 ");
            System.out.println("To Exit press 0 ");
            System.out.println("Enter your choice : ");
            operations = input.nextInt();
            switch (operations) {
                case 1:
                    System.out.println("Please, Enter Your Name");
                    String name = input.next();
                    System.out.println("Please, Enter Your Email");
                    String email = input.next();
                    Person p1 = new Person(name, "1", email);
                    System.out.println("Please, Enter Your Password");
                    String password = input.next();
                    BankAcc b = new BankAcc(p1, 0, password);
                    System.out.println("Well Done " + b.getOwner().getName());
                    System.out.println("Now Yoy have an account");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter your amount ");
                    double amount = input.nextDouble();
                    B1.deposit(amount);
                    System.out.println("Done " + B1.getOwner().getName() + "\n" + " Your balance is : " + B1.getBalance());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter your amount ");
                    double amount2 = input.nextDouble();
                    B1.withdraw(amount2);
                    System.out.println("Done " + B1.getOwner().getName() + "\n" + " Your balance is : " + B1.getBalance());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter Account Name : ");
                    String NameAccount = input.next();
                    System.out.println("Enter Account Password : ");
                    String PAccount = input.next();
                    System.out.println("Enter Your amount ");
                    double amount3 = input.nextDouble();
                    B1.transfer(amount3, B2);
                    System.out.println("Done " + B1.getOwner().getName() + "\n" + " Your balance is : " + B1.getBalance());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Your balance is : " + B1.getBalance());
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice ,please try again");
                    System.out.println();
                    break;
            }

        } while (!quit);
        System.out.println("Thanks !");
    }

}
