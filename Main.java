import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountNumber = "10293738357";
        account.accountName = "Ethan Moises";
        account.balance = 1000000d;
        account.accountPin = 2135;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your PIN:");
        int pin = scan.nextInt();
        if (pin == account.accountPin) {
        for (; ;) {


            System.out.println("1. Account Information 2. Withdraw Account 3. Deposit Account 4. Exit");
            int number = scan.nextInt();
            if (number == 4) {
                System.out.println("Thank you for using this banking software.");
                break;
            }
            switch (number) {
                case 1:
                    System.out.println("Full Name:" + " " + account.accountName);
                    System.out.println("Account Number:" + " " + account.accountNumber);
                    System.out.println("Current Balance:" + " " + account.balance);
                    break;
                case 2:
                    System.out.println("Input the amount you would like to withdraw:");
                    int withdrawAmount = scan.nextInt();
                    account.withdrawal((double) withdrawAmount);
                    System.out.println("You Have Widthrawn An Amount Of:" + " " + withdrawAmount);
                    break;
                case 3:
                    System.out.println("Input the amount you would like to deposit:");
                    int depositAmount = scan.nextInt();
                    account.deposit((double) depositAmount);
                    break;
            }
            System.out.println("Select any key to return to the menu.");
            String response = scan.next();

          }

        }
        else {
            System.out.println("The PIN you have entered is invalid. Please use a valid pin.");
        }
    }
}





