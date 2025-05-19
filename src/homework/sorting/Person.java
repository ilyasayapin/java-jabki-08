package homework.sorting;

import java.util.Arrays;

public class Person implements Sortable {
    int age;

    public Person(int age) {
        this.age = age;
    }


    @Override
    public int compare(Sortable other) {
        Person person = (Person) other;
        return Integer.compare(this.age, person.age);
    }





//
        }

    }
}
