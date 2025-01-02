package app.test;

import app.model.items.Customer;
import app.model.media.*;
import app.model.items.*;
import app.model.store.Store;
import app.model.store.Finances;

import java.util.*;

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
        Book book1 = new Book("The Great Gatsby", new ArrayList<>(List.of("F. Scott Fitzgerald")), 1925, new ArrayList<>(List.of("Fiction")), "English", 10.99f, 123);
        Book book2 = new Book("To Kill a Mockingbird", new ArrayList<>(List.of("Harper Lee")), 1960, new ArrayList<>(List.of("Fiction")), "English", 11.99f, 281);
        Book book3 = new Book("1984", new ArrayList<>(List.of("George Orwell")), 1949, new ArrayList<>(List.of("Fiction")), "English", 12.99f, 328);
        Book book4 = new Book("The Catcher in the Rye", new ArrayList<>(List.of("J.D. Salinger")), 1951, new ArrayList<>(List.of("Fiction")), "English", 13.99f, 214);

        Track track1 = new Track("Track 1", 321);
        Track track2 = new Track("Track 2", 322);
        Track track3 = new Track("Track 3", 323);
        Track track4 = new Track("Track 4", 324);
        Track track5 = new Track("Track 5", 325);
        Track track6 = new Track("Track 6", 326);
        Track track7 = new Track("Track 7", 327);
        Track track8 = new Track("Track 8", 328);
        Track track9 = new Track("Track 9", 329);

        // Example instantiation of CD object
        CD cd1 = new CD("The Dark Side of the Moon", new ArrayList<>(List.of("Pink Floyd")), 1973, new ArrayList<>(List.of("Rock")), "English", 14.99f, new ArrayList<>(List.of(track1, track2, track3)));
        CD cd2 = new CD("Back in Black", new ArrayList<>(List.of("AC/DC")), 1980, new ArrayList<>(List.of("Rock")), "English", 15.99f, new ArrayList<>(List.of(track4, track5, track6)));
        CD cd3 = new CD("Led Zeppelin IV", new ArrayList<>(List.of("Led Zeppelin")), 1971, new ArrayList<>(List.of("Rock")), "English", 16.99f, new ArrayList<>(List.of(track7, track8, track9)));


        // Example instantiation of DVD objects

        DVD dvd1 = new DVD("The Shawshank Redemption", new ArrayList<>(List.of("Frank Darabont")), 1994, new ArrayList<>(List.of("Drama")), "English", 17.99f, 142);
        DVD dvd2 = new DVD("The Godfather", new ArrayList<>(List.of("Francis Ford Coppola")), 1972, new ArrayList<>(List.of("Drama")), "English", 18.99f, 175);
        DVD dvd3 = new DVD("The Dark Knight", new ArrayList<>(List.of("Christopher Nolan")), 2008, new ArrayList<>(List.of("Action")), "English", 19.99f, 152);
        DVD dvd4 = new DVD("Pulp Fiction", new ArrayList<>(List.of("Quentin Tarantino")), 1984, new ArrayList<>(List.of("Crime")), "English", 20.99f, 154);



        media.add(book1);
        media.add(book2);
        media.add(book3);
        media.add(book4);


        media.add(dvd1);
        media.add(dvd2);
        media.add(dvd3);
        media.add(dvd4);

        media.add(cd1);
        media.add(cd2);
        media.add(cd3);


        ArrayList<Staff> staff = new ArrayList<>();

        Staff staff1 = new Staff("john@hms.com", "password", "John", 2024, "Staff", 232, 0, 0, new int[] {1,1,1});
        Manager manager1 = new Manager("josh@hms.com", "password", "Josh", 2023, "Staff", 232, 0, 0, new int[] {1,1,1});


        staff.add(staff1);
        staff.add(manager1);

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