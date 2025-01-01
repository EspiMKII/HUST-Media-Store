package app.test;

import app.model.credentials_info.Customer;
import app.model.media.*;
import app.model.credentials_info.*;
import app.model.store.Store;

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
        Book book1 = new Book("The Great Gatsby", new ArrayList<>(List.of("F. Scott Fitzgerald")), new Date(1925, Calendar.JANUARY, 1), new ArrayList<>(List.of("Fiction")), "English", 10.99f, 123);
        Book book2 = new Book("To Kill a Mockingbird", new ArrayList<>(List.of("Harper Lee")), new Date(1960, Calendar.JANUARY, 1), new ArrayList<>(List.of("Fiction")), "English", 11.99f, 281);
        Book book3 = new Book("1984", new ArrayList<>(List.of("George Orwell")), new Date(1949, Calendar.JANUARY, 1), new ArrayList<>(List.of("Fiction")), "English", 12.99f, 328);
        Book book4 = new Book("The Catcher in the Rye", new ArrayList<>(List.of("J.D. Salinger")), new Date(1951, Calendar.JANUARY, 1), new ArrayList<>(List.of("Fiction")), "English", 13.99f, 214);


        // Example instantiation of CD object
        CD cd1 = new CD("The Dark Side of the Moon", new ArrayList<>(List.of("Pink Floyd")), new Date(1973, Calendar.JANUARY, 1), new ArrayList<>(List.of("Rock")), "English", 14.99f, (Map.of("Speak to Me", 90, "Breathe", 163, "On the Run", 216, "Time", 421, "The Great Gig in the Sky", 276, "Money", 382, "Us and Them", 462, "Any Colour You Like", 205, "Brain Damage", 228, "Eclipse", 123)));
        CD cd2 = new CD("Back in Black", new ArrayList<>(List.of("AC/DC")), new Date(1980, Calendar.JANUARY, 1), new ArrayList<>(List.of("Rock")), "English", 15.99f,  (Map.of("Hells Bells", 312, "Shoot to Thrill", 311, "What Do You Do for Money Honey", 203, "Givin the Dog a Bone", 215, "Let Me Put My Love into You", 246, "Back in Black", 254, "You Shook Me All Night Long", 210, "Have a Drink on Me", 225, "Shake a Leg", 242, "Rock and Roll Ain't Noise Pollution", 252)));
        CD cd3 = new CD("Led Zeppelin IV", new ArrayList<>(List.of("Led Zeppelin")), new Date(1971, Calendar.JANUARY, 1), new ArrayList<>(List.of("Rock")), "English", 16.99f, (Map.of("Black Dog", 296, "Rock and Roll", 220, "The Battle of Evermore", 351, "Stairway to Heaven", 482, "Misty Mountain Hop", 278, "Four Sticks", 284, "Going to California", 215, "When the Levee Breaks", 427)));


        // Example instantiation of DVD objects

        DVD dvd1 = new DVD("The Shawshank Redemption", new ArrayList<>(List.of("Frank Darabont")), new Date(1994, Calendar.JANUARY, 1), new ArrayList<>(List.of("Drama")), "English", 17.99f, 142);
        DVD dvd2 = new DVD("The Godfather", new ArrayList<>(List.of("Francis Ford Coppola")), new Date(1972, Calendar.JANUARY, 1), new ArrayList<>(List.of("Drama")), "English", 18.99f, 175);
        DVD dvd3 = new DVD("The Dark Knight", new ArrayList<>(List.of("Christopher Nolan")), new Date(2008, Calendar.JANUARY, 1), new ArrayList<>(List.of("Action")), "English", 19.99f, 152);
        DVD dvd4 = new DVD("Pulp Fiction", new ArrayList<>(List.of("Quentin Tarantino")), new Date(1994, Calendar.JANUARY, 1), new ArrayList<>(List.of("Crime")), "English", 20.99f, 154);



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