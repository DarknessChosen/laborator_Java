import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CourseManager {
    Course[] courses;

    public CourseManager() {
        courses = new Course[0];
    }

    public void addCourse(Course course) {
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];

        for (int i = 0; i < courses.length; i++) {
            aux[i] = courses[i];
        }

        aux[newLength - 1] = course;
        courses = aux;
    }

    public void displayCoursesToConsole() {
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}

