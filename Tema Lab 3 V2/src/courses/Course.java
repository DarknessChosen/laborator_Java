package courses;

import java.util.Arrays;
import java.util.Objects;

public class Course implements  CourseOperations {

    String name;
    String description;
    Professor teacher;

    int CourseNumber;

    //Ex4
    int AverageGrade;

    Student[] students;

    public Course(String name, String description, Professor teacher, Student[] students, int CourseNumber) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
        this.CourseNumber = CourseNumber;

    }

    public Course() {

        this.name = " ";
        this.description = " ";
        this.teacher = null;
        this.students = null;
        this.CourseNumber = 0;

    }

    public void updateProfessor(Professor teacher)
    {
        this.teacher = teacher;
    }

    public void addStudent(Student student)
    {

        int newLength = students.length + 1;
        Student[] aux = new Student [newLength];
        int index = 0;

        for(Student s : students)
        {

            aux[index++] = s;

        }

        aux[index] = student;

        this.students = new Student[newLength];

        System.arraycopy(aux, 0 , students, 0, newLength);

    }

    @Override
    public String toString() {
        String str = "Course: " + name +"\nDescription:" + description + "\nTeacher: " + teacher + " AverageGrade =" + AverageGrade + ".\nStudents:\n";
        for(Student s : students)
        {

            str += s + "\n";

        }

    return str;

    }

    public int getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        AverageGrade = averageGrade;
    }

    @Override
    public void UpdateProfessor(Professor p) {

    }

    @Override
    public void AddStudent(Student student) {

    }

    @Override
    public void RemoveStudent(Student student) {

        int newLength = students.length - 1;
        Student[] aux = new Student [newLength];
        int index = 0;

        for(Student s : students)
        {
            if(!s.equals(student) )
            aux[index++] = s;

        }

        this.students = new Student[newLength];

        System.arraycopy(aux, 0 , students, 0, newLength);

    }

    @Override
    public void UpdateStudent(Student student) {

        int contor = 0;
        for(Student s : students)
        {

            if(s.name.equals(student.name))
            {
                students[contor] = student;
            }

            contor++;
        }

    }

    @Override
    public void UpdateCourse(String name, String description) {

        this.name = name;
        this.description = description;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return CourseNumber == course.CourseNumber && AverageGrade == course.AverageGrade && Objects.equals(name, course.name) && Objects.equals(description, course.description) && Objects.equals(teacher, course.teacher) && Arrays.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, description, teacher, CourseNumber, AverageGrade);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }
}
