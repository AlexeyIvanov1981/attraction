import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Deque<Person> attraction = generateClients();

        while (!attraction.isEmpty()) {
            Person user = attraction.removeFirst();
            System.out.println(user.getName() + " " + user.getSurname() + " прокатился на атракционе (кол-во билетов "
                    + user.getNumberOfTickets() + ")");
            user.deleteTicket();

            if (user.getNumberOfTickets() > 0) {
                attraction.addLast(user);
            }
        }
    }

    public static LinkedList<Person> generateClients() {

        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Alex", "Do", 5));
        person.add(new Person("Bob", "Moon", 3));
        person.add(new Person("Tom", "Lee", 2));
        person.add(new Person("Jack", "Kovalsky", 4));
        person.add(new Person("Max", "Woo", 1));

        return person;
    }
}
