package scanner;
import java.util.Scanner;

public class checkbank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String customername = scan.next();

        System.out.println("Enter your address:");
        String customeraddress = scan.next();

        System.out.println("Enter your mobile number:");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter opening balance:");
        double balance = scan.nextDouble();

        BankApplication obj=new BankApplication(customername, customeraddress, phoneNumber, balance);

        System.out.println("Account created successfully");

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = scan.nextDouble();
                    obj.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double wd = scan.nextDouble();
                    obj.withdraw(wd);
                    break;

                case 3:
                    obj.showbalance();  
                    break;

                case 4:
                    System.out.println("Thank you for using Bank Application");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        scan.close();
    }
}
