import java.util.Scanner;

class Movie {

    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown");   // เรียก constructor ตัวที่ 2
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);   // เรียก constructor ตัวที่ 3
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;

        if (rating < 0.0) {
            this.rating = 0.0;
        } else if (rating > 10.0) {
            this.rating = 10.0;
        } else {
            this.rating = rating;
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Director: " + director + ", Rating: " + rating);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();
        sc.nextLine();

        Movie movie;

        if (mode == 1) {
            String title = sc.nextLine();
            movie = new Movie(title);

        } else if (mode == 2) {
            String title = sc.nextLine();
            String director = sc.nextLine();
            movie = new Movie(title, director);

        } else { // mode == 3
            String title = sc.nextLine();
            String director = sc.nextLine();
            double rating = sc.nextDouble();
            movie = new Movie(title, director, rating);
        }

        movie.displayDetails();
    }
}
