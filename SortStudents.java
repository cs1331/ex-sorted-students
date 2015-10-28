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

    public static List<Student> sortByGradeComparator(
            List<Student> students) {

        Collections.sort(students, new GradeComparator());
        return students;
    }

    public static List<Student> sortByGradeAnonymousClass(
            List<Student> students) {

        Collections.sort(students,
            new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    int comp = Float.compare(s1.getGrade(), s2.getGrade());
                    if (0 == comp) {
                        comp = s1.getGTID() - s2.getGTID();
                    }
                    return comp;
                }
            });
        return students;
    }

    public static List<Student> sortByGradeLambda(
            List<Student> students) {

        Collections.sort(students,
            (Student s1, Student s2) -> {
                int comp = Float.compare(s1.getGrade(), s2.getGrade());
                if (0 == comp) {
                    comp = s1.getGTID() - s2.getGTID();
                }
                return comp;
            });
        return students;
    }
}
