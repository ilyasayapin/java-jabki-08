package homework.sorting;

import java.util.Arrays;

public class Person implements Sortable {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compare(Sortable other) {
        Person person = (Person) other;
        return Integer.compare(this.age, person.age);
    }

    @Override
    public String toString() {
        return String.format("%s", age);
    }
}


