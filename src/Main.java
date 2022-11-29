import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> attraction = new LinkedList<>();
        attraction.addAll(generateClients());

        for (Person p : attraction) {
            System.out.println(p.getName() + " " + p.getSurname() + ", количество билетов - " + p.numberOfTickets);
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