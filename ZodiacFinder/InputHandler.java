import java.time.MonthDay;
import java.util.Scanner;
public class InputHandler {
    Scanner scan = new Scanner(System.in);

    public void userInput() {
        while (true) {
            System.out.println("Enter Name: ");
            String name = scan.nextLine();

            System.out.println("Enter Your Birth Month: ");
            int month = scan.nextInt();

            System.out.println("Enter Your Birth Date: ");
            int date = scan.nextInt();

            System.out.println("Enter Your Birth Year: ");
            int year = scan.nextInt();
            scan.nextLine();

            MonthDay birthday = MonthDay.of(month, date);

            CheckSign cs = new CheckSign();
            Horoscope horoscope = cs.checkSign(birthday);

            System.out.println("----RESULT----");
            System.out.println("Name: " + name);
            System.out.println("Birthday: " + month + "/" + date + "/" + year);
            System.out.println("Zodiac Sign: " + horoscope.getSign());
            System.out.println("Destiny: " + horoscope.getDestiny());
            System.out.println("Lucky Number: " + horoscope.getLuckyNumber());
            System.out.println("Love Life: " + horoscope.getLoveLife());

            System.out.println("Would you like to Continue? (y/n): ");
            while (true) {
                String choice = scan.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    break;
                } else if (choice.equalsIgnoreCase("n")) {
                    System.out.println("Exiting program...");
                    return;
                } else {
                    System.out.println("Incorrect input. Please enter y or n: ");
                }
            }
        }
    }
}
