package classes;

import java.util.Arrays;

public class Course {

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
}
