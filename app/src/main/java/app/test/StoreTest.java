package app.test;

import app.model.credentials_info.Customer;
import app.model.media.*;
import app.model.credentials_info.*;
import app.model.store.Store;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreTest {
    public static Store test() {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("John", 1234567890, 0);
        Customer customer2 = new Customer("Jane", 1234567891, 0);
        Customer customer3 = new Customer("Jim", 1234567892, 0);
        Customer customer4 = new Customer("Jill", 1234567893, 0);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        ArrayList<Media> media = new ArrayList<>();

        // Example instantiation of Book objects
        Book book1 = new Book("The Great Gatsby", new ArrayList<>(List.of("F. Scott Fitzgerald")), new Date(1925-1900, 0, 1), new ArrayList<>(List.of("Fiction")), "English", 10.99f, 123);
        Book book2 = new Book("1984", new ArrayList<>(List.of("George Orwell")), new Date(1949-1900, 0, 1), new ArrayList<>(List.of("Dystopian")), "English", 8.99f, 456);
        Book book3 = new Book("To Kill a Mockingbird", new ArrayList<>(List.of("Harper Lee")), new Date(1960-1900, 0, 1), new ArrayList<>(List.of("Fiction")), "English", 7.99f, 789);
        Book book4 = new Book("Moby Dick", new ArrayList<>(List.of("Herman Melville")), new Date(1851-1900, 0, 1), new ArrayList<>(List.of("Adventure")), "English", 9.99f, 101);

        // Example instantiation of CD object

        // Example instantiation of DVD objects
        DVD dvd1 = new DVD("The Shawshank Redemption", new ArrayList<>(List.of("Frank Darabont")), new Date(1994-1900, 0, 1), new ArrayList<>(List.of("Drama")), "English", 17.99f, 142);
        DVD dvd2 = new DVD("The Godfather", new ArrayList<>(List.of("Francis Ford Coppola")), new Date(1972-1900, 0, 1), new ArrayList<>(List.of("Crime", "Drama")), "English", 18.99f, 175);
        DVD dvd3 = new DVD("The Dark Knight", new ArrayList<>(List.of("Christopher Nolan")), new Date(2008-1900, 0, 1), new ArrayList<>(List.of("Action", "Crime", "Drama")), "English", 19.99f, 152);
        DVD dvd4 = new DVD("Pulp Fiction", new ArrayList<>(List.of("Quentin Tarantino")), new Date(1994-1900, 0, 1), new ArrayList<>(List.of("Crime", "Drama")), "English", 20.99f, 154);

        media.add(book1);
        media.add(book2);
        media.add(book3);
        media.add(book4);


        media.add(dvd1);
        media.add(dvd2);
        media.add(dvd3);
        media.add(dvd4);

        ArrayList<Staff> staff = new ArrayList<>();

        ArrayList<Finances> finances = new ArrayList<>();

        Finances finances1 = new Finances("2/24", 1000, 700, 300);
        Finances finances2 = new Finances("2/25", 1000, 700, 300);
        Finances finances3 = new Finances("2/26", 1000, 700, 300);
        Finances finances4 = new Finances("2/27", 1000, 700, 300);

        finances.add(finances1);
        finances.add(finances2);
        finances.add(finances3);
        finances.add(finances4);

        return new Store(media, customers, staff, finances);
    }

    public StoreTest() {
    }
}