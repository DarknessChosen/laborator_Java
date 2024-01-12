package courses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class MockClassesManager implements ISourceManager {



    @Override
    public List<Course> getCourses() {

        List<Course> cursuri = new ArrayList<Course>();
        LinkedHashSet <Student> studenti = new LinkedHashSet<Student>();
        Student stud1 = new Student("Andrei" , "Negoita" , 2231);
        Student stud2 = new Student("Ion", "Mateescu" , 4221);

        studenti.add(stud1);
        studenti.add(stud2);

        Professor prof = new Professor("Anton" , "Panaitescu");

        cursuri.add(new Course("Rezistenta Materialelor" , "calculul reactiunilor, \n" + "diagramele de eforturi, calculul caracteristicilor geometrice ale \n " + "suprafetelor plane si calculul elementelor de rezistenta la solicitari simple \n", prof, studenti,1));


        return cursuri;
    }

    @Override
    public void AddCourse(Course course) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void UpdateCourse(Course course) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void DeleteCourse(Course course) {

        throw new UnsupportedOperationException("Not supported yet.");

    }


        public static void main(String[] args) {

            LinkedHashSet<Student> students = new LinkedHashSet<Student>();
            LinkedHashSet<Student> students2 = new LinkedHashSet<Student>();


            Student stud1 = new Student("Robert", "Ion", 4213);
            Student stud4 = new Student("Boba" , "Feta" , 7891);
            Student stud5 = new Student("Robert", "Ion",  7891);
            Student stud2 = new Student("Rares" , "Bogdan", 1893);
            Student stud6 = new Student("Popa" , "Lorenzo" , 5555);
            students2.add(stud5);
            students2.add(stud4);
            students.add(stud2);
            students.add(stud1);
            students.add(stud6);


            Professor prof = new Professor("Anton" , "Panaitescu");


            Course course = new Course("Material Resistance", " Calculations of reactions ,\n" + "effort diagrams , calculations of geometry characteristics of \n" + "flat surfaces and calculations of resistance elements to simple stresses \n" , prof , students, 1);
            Course course2 = new Course("Java", " Programming" , prof , students2, 1);

            CourseManager courseManager = new CourseManager();
            courseManager.AddCourse(course);
            courseManager.AddCourse(course2);





            stud1.AddGrade(10);
            stud2.AddGrade(5);

            //ex1
            courseManager.GroupStudents(course);
            //ex2
            System.out.println(stud1.compareTo(stud5));
            //ex3
            courseManager.SortCourses();
            courseManager.displayCoursesToConsole();
            //ex4
            System.out.println(courseManager.SearchCourse("Java"));
            


        }

}
