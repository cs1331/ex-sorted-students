import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        float gradeDiff = s1.getGrade() - s2.getGrade();
        if (0 == gradeDiff) {
            return s1.getGTID() - s2.getGTID();
        } else {
            return (int) Math.ceil(gradeDiff);
        }
    }
}
