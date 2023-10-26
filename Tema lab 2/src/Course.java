public class Course {
    String name;
    String description;
    Professor teacher;
    Student[] students;

    public Course(String name, String description, Professor teacher, Student[] students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public Professor getTeacher() {
        return teacher;
    }
}