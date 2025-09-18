import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();


        int choice;

        while(true){

            System.out.println("1. Create");
            System.out.println("2. View all");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter a name: ");
                    String name = scan.nextLine();
                    names.add(name);
                    break;
                case 2:
                    int i = 1;
                    for(String n: names) {
                        System.out.println(i + ". " + n);
                        System.out.println("-------------");
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("Enter number: ");
                    int selection = scan.nextInt();
                    System.out.println(names.get(selection -1));
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("You have entered an invalid choice.");

            }


        }
    }
}