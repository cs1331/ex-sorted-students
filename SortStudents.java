import java.io.IOException;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class SortStudents {

    public static void main(String[] args) throws IOException {
        List<Student> students = new StudentsFile("students.csv").getStudents();
        printStudents(sortByNaturalOrdering(students));
    }

    public static void printStudents(
            List<Student> students) {

        for (Student student: students) {
            System.out.println(student);
        }
    }

    public static List<Student> sortByNaturalOrdering(
            List<Student> students) {

        Collections.sort(students);
        return students;
    }

    public static List<Student> sortByGrade(
            List<Student> students) {

        // TODO
        return students;
    }
}
