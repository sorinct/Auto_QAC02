package homework.library;

import java.sql.SQLOutput;

public class Library {
    public static void display (String authorName, String authorEmail, String bookName, int year, double price) {

        Author author = new Author(authorName,authorEmail);
        Book book = new Book(bookName,year,author,price);

        System.out.println(("Book " + book.getName() + " (" + book.getPrice() + " RON),by " + author.getName() + ", published in " + book.getYear()));
    }
    public static void main(String[] args) {

        display("Sorin","sorinct95@gmail.com","Noaptea albastra",2000, 25);
        display("Alin","sorincdasdat95@gmail.com","Nofasfasaptea albastra",20200, 225);
//        ctrl + D
//        Author author = new Author("Sorin","sorinct95@gmail.com");
//        Book book = new Book("Noaptea albastra",2000, author, 25);
//
//        Author author2 = new Author("Alin","alin.96@gmail.com");
//        Book book2 = new Book("Luceafarul",2003, author2, 28);
//
//        System.out.println(("Book " + book.getName() + " (" + book.getPrice() + " RON),by " + author.getName() + ", published in " + book.getYear()));
//        System.out.println(("Book " + book2.getName() + " (" + book2.getPrice() + " RON),by " + book2.getAuthor().getName() + ", published in " + book2.getYear()));
    }



    }

