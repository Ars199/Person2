import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    public int compare(Person e1, Person e2) {
        
        return e1.getName().compareTo(e2.getName());
    }

}

