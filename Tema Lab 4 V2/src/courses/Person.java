package courses;

import java.util.Objects;

public abstract class Person implements Comparable<Student>{

    String name;
    String surname;

    @Override
    public String toString() {
        return "Person: " + name + " " + surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
