import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t1 = sc.nextLine();
        int w1 = sc.nextInt();
        sc.nextLine();

        String p1 = sc.nextLine();
        int pages1 = sc.nextInt();
        sc.nextLine();

        String t2 = sc.nextLine();
        int w2 = sc.nextInt();
        sc.nextLine();

        String p2 = sc.nextLine();
        int pages2 = sc.nextInt();

        Document d1 = new TextDocument(t1, w1);
        Document d2 = new PDFDocument(p1, pages1);
        Document d3 = new TextDocument(t2, w2);
        Document d4 = new PDFDocument(p2, pages2);

        Document[] docs = { d1, d2, d3, d4 };

        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.pageCount;
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);

        sc.close();
    }
}
