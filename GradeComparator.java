import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        int comp = Float.compare(s1.getGrade(), s2.getGrade());
        if (0 == comp) {
            comp = s1.getGTID() - s2.getGTID();
        }
        return comp;
    }
}
