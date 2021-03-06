import java.util.Comparator;

public class CustomComparator implements Comparator<Person2> {

    public int compare(Person2 o1, Person2 o2) {
        return o1.getAge()-o2.getAge();
    }
}
