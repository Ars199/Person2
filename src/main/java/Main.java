import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person2> person = new ArrayList<Person2>();
        person.add(new Person2("Ivanov Ivan Ivanovich"));
        person.add(new Person2("Petrov Petr Petrovich"));
        person.add(new Person2("Kolin Nikolay Nikolayevich"));
        person.add(new Person2("James Jameson"));
        person.add(new Person2("Lena"));

        Comparator ageComparator = new CustomComparator();
        Collections.sort(person, ageComparator);

        System.out.println(person);
    }
}
