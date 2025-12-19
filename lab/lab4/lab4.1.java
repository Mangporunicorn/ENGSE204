import java.util.Scanner;

class Book {

    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();
        sc.nextLine();

        Book b;

        if (mode == 1) {
            String title = sc.nextLine();
            b = new Book(title);
        } else {
            String title = sc.nextLine();
            String author = sc.nextLine();
            b = new Book(title, author);
        }

        b.displayInfo();
    }
}
