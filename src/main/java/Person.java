import java.util.Random;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name) {
        this.name = name;
        this.age = new Random().nextInt(50);
    }

    public String toString() {
        return name + " " + age;
    }
}
