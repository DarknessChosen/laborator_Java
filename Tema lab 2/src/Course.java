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
    public void updateProfessor(Professor teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        int newLength = students.length + 1;
        Student[] aux = new Student[newLength];
        System.arraycopy(students, 0, aux, 0, students.length);
        aux[newLength - 1] = student;
        this.students = aux;
    }


    public Object getName() {
        return null;
    }

    public Student[] getStudents() {
        return new Student[0];
    }

    public Object getTeacher() {
        return null;
    }
}
