import java.util.*;
public class Main{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

        System.out.println("Pick A Movie Type: ");
        System.out.println("1. ACTION");
        System.out.println("2. COMEDY");
        System.out.println("3. DRAMA");
        System.out.println("4. HORROR");
        System.out.print("Select 1-4: ");
        int choice = scan.nextInt();
        scan.nextLine();

        MovieType movieType;

        switch (choice) {
            case 1: movieType = MovieType.ACTION; break;
            case 2: movieType = MovieType.COMEDY; break;
            case 3: movieType = MovieType.DRAMA; break;
            case 4: movieType = MovieType.HORROR; break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }

        System.out.print("What is the name of the movie?: ");
        String movieName = scan.nextLine();

        ArrayList<String> actors = new ArrayList<>();
        String actor;

        while(true) {
            System.out.println("Enter Actors (N to stop): ");
            actor = scan.nextLine();

            if (actor.equalsIgnoreCase("n")) {
                break;
            }
            actors.add(actor);
        }

        Movie movie = new Movie(movieName, movieType, actors);

        movie.displayMovie();
    }
}