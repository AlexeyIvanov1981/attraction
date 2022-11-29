import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>();
        attraction.addAll(generateClients());
//        for (int i = 0; i < generateClients().size(); i++) {
//            Person tmp = generateClients().get(i);
//            attraction.offer(tmp);
//        }

        System.out.println(attraction);

    }

    public static LinkedList<Person> generateClients() {

        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Alex", "Do", 5));
        person.add(new Person("Bob", "Mo", 3));
        person.add(new Person("Tom", "Lo", 2));
        person.add(new Person("Jack", "Ko", 4));
        person.add(new Person("Max", "Woo", 1));


        return person;

    }
}