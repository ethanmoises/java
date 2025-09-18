import javax.xml.namespace.QName;
import java.util.*;
public class Main{
    public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Car> cars = new ArrayList<>();

        while(true){
            System.out.println("1. Create");
            System.out.println("2. View All Cars");
            System.out.println("3. Select Car");
            System.out.println("4. Exit");
            System.out.println("Enter Choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice) {
                case 1:
                    try {
                        System.out.println("Enter Brand: ");
                        String brand = scan.nextLine();
                        System.out.println("Enter Model: ");
                        String model = scan.nextLine();
                        System.out.println("Enter Year: ");
                        int year = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Enter Color: ");
                        String color = scan.nextLine();
                        System.out.println("Enter Engine Type (GASOLINE, DIESEL, ELECTRIC, HYBRID): ");
                        String engineInput = scan.nextLine().toUpperCase().trim();

                        EngineType engineType = EngineType.valueOf(engineInput);

                        Car car = new Car(brand, model, year, color, engineType);
                        cars.add(car);
                    } catch (Exception e) {
                        System.out.println("Something Went Wrong...");
                    }


                    break;

                case 2:
                    int count = 1;
                    for(Car c: cars) {
                        System.out.println(count + ".");
                        c.displayCar();
                        count++;
                        System.out.println("-----------");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Select A Car: ");
                        int selection = scan.nextInt();
                        System.out.println(cars.get(selection - 1));
                    }catch (Exception e) {
                        System.out.println("Invalid Choice!");
                    }
                    break;

                case 4:
                    return;
            }

        }
    }
}