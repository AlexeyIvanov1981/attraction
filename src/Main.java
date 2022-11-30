import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> attraction = new LinkedList<>(generateClients());

        Iterator<Person> personIterator = attraction.iterator();

        while (!attraction.isEmpty()) {
            Person person = personIterator.next();
            System.out.println(person.getName() + " " + person.getSurname() + ", количество билетов - " + person.getNumberOfTickets());
            person.deleteTicket();
            if (person.getNumberOfTickets() == 0) {
                personIterator.remove();
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
