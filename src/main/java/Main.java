import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<Person>();
        person.add(new Person("Ivanov Ivan Ivanovich"));
        person.add(new Person("Petrov Petr Petrovich"));
        person.add(new Person("Kolin Nikolay Nikolayevich"));
        person.add(new Person("James Jameson"));
        person.add(new Person("Lena"));


        Comparator ageComparator = new AgeComparator();
        Comparator nameComparator = new NameComparator();

        //Collections.sort(person, nameComparator);
        Collections.sort(person, ageComparator);

        System.out.println(person.stream().filter((p) -> p.getAge() < 30).collect(Collectors.toList()));

    }
}
