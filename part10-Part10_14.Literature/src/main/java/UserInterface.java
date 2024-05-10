
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Book> books;
    
    public UserInterface(Scanner scanner, ArrayList<Book> books) {
        this.scanner = scanner;
        this.books = books;
    }
    
    public void start() {
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = this.scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            this.books.add(new Book(name, age));
            System.out.println("");
        }
        
        System.out.println(books.stream().count() + " books in total.");
        
        System.out.println("Books:");
        //books.stream().forEach(b -> System.out.println(b));
        
        /*
        Comparator<Book> comparator = Comparator
                      .comparing(Book::getRecommendedAge)
                      .thenComparing(Book::getName);;

        Collections.sort(books, comparator);

        for (Book e: books) {
            System.out.println(e);
        }
        */
        books.stream().sorted().forEach(book -> {
            System.out.println(book);
        });
    }
}
