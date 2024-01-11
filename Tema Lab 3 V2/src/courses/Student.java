package courses;

import java.util.Arrays;
import java.util.Objects;

public class Student extends Person {

    int groupNumber;

    int courseLength = 1;


    //Ex4
    int[] courseGrades = new int[100];

    public Student(String name, String surname, int groupNumber) {

        this.groupNumber = groupNumber;
        this.name = name;
        this.surname = surname;


    }


    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    //Ex4
    public void AddGrade(int grade)
    {

        courseGrades[courseLength] = grade;
        courseLength ++;

    }

    @Override
    public String toString() {
        return "Students: " + name + " " + surname + ", Group Number: " + groupNumber;
    }

    public Student() {

        this.groupNumber = 0;
        this.name = " ";
        this.surname = " ";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber && courseLength == student.courseLength && Arrays.equals(courseGrades, student.courseGrades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(groupNumber, courseLength);
        result = 31 * result + Arrays.hashCode(courseGrades);
        return result;
    }
}
