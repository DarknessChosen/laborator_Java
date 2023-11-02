public class Student extends Person {
    int groupNumber;

    // Constructor implicit
    public Student() {
        this.name = "";
        this.surname = "";
        this.groupNumber = 0;
    }

    // Suprascrie metoda toString()
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group number=" + groupNumber +
                '}';
    }

    // Exercise 4: Return Grade
    public double getGrade() {
        // Implementat pentru a afișa nota studentului.
        return 0.0; // Valoare provizorie
    }
}