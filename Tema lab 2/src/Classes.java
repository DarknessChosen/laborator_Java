public class Classes {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Andrei", "Ciobanu", 2231),
                new Student("Vadim", "Tudor", 4221)
        }; // Definirea studenților

        Professor prof = new Professor("Nicolae", "Ceausescu"); // Definirea profesorului

        Course course = new Course("Material Resistance", "Calculation of reactions,\n"
                + "effort diagrams, calculations of geometric characteristics of \n"
                + "flat surfaces and calculations of resistance elements to simple  stresses\n", prof, students); // Definirea cursului

        CourseManager courseManager = new CourseManager(); // Crearea unei instanțe de CourseManager
        courseManager.addCourse(course); // Adăugarea cursului la CourseManager
        courseManager.displayCoursesToConsole(); // Afișarea cursurilor
    }
}
