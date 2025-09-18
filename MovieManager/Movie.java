import java.util.ArrayList;

public class Movie {
    private String name;
    private MovieType movieType;
    private ArrayList<String> actors;

    public Movie(String name, MovieType movieType, ArrayList<String> actors) {
        this.name = name;
        this.movieType = movieType;
        this.actors = actors;
    }

    public void displayMovie() {
        System.out.println("Movie Type: " + movieType);
        System.out.println("Movie Name: " + name);
        System.out.println("Actors: ");

        for (String a: actors) {
            System.out.println(a);
        }
    }
}