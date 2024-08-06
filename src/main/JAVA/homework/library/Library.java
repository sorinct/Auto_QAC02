package homework.library;

public class Library {
//        - Varianta 2 -
//        public static void display (String authorName, String authorEmail, String bookName, int year, double price) {
//        Author author = new Author(authorName,authorEmail);
//        Book book = new Book(bookName,year,author,price);
//        System.out.println(("Book " + book.getName() + " (" + book.getPrice() + " RON),by " + author.getName() + ", published in " + book.getYear()));
//    }

    public static void main(String[] args) {

        Author author = new Author("Sorin", "sorinct95@gmail.com");
        Book book = new Book("Java", 2000, author, 25);

        Author author2 = new Author("Alin", "alintacu@gmail.com");
        Book book2 = new Book("JavaScript", 2003, author2, 28);

        Author author3 = new Author("Miruna", "mirunatacu@gmail.com");
        Book book3 = new Book("Html", 2015, author3, 35);

        Author author4 = new Author("Laura", "lauratacu@gmail.com");
        Book book4 = new Book("Css", 2019, author4, 43);

        System.out.println(("Book " + book.getName() + " (" + book.getPrice() + " RON),by " + author.getName() + ", published in " + book.getYear()));
        System.out.println(("Book " + book2.getName() + " (" + book2.getPrice() + " RON),by " + author2.getName() + ", published in " + book2.getYear()));
        System.out.println(("Book " + book3.getName() + " (" + book3.getPrice() + " RON),by " + author3.getName() + ", published in " + book3.getYear()));
        System.out.println(("Book " + book4.getName() + " (" + book4.getPrice() + " RON),by " + author4.getName() + ", published in " + book4.getYear()));

//         - Varianta 2 -
//        display("Sorin","sorinct95@gmail.com","Java",2000, 25);
//        display("Alin","alintacu@gmail.com","JavaScript",2003, 28);
//        display("Miruna","mirunatacu@gmail.com","Html",2015, 35);
//        display("Laura","lauratacu@gmail.com","Css",2019, 43);

        }
    }

