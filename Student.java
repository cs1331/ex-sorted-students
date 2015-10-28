public class Student implements Comparable<Student> {

    private String name;
    private int gtid;
    private float grade;

    public Student(String name, int gtid, float grade) {
        this.name = name;
        this.gtid = gtid;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGTID() {
        return gtid;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) throws ValueOutOfRangeException {
        if (grade > 100.0 || grade < 0.0) {
            throw new ValueOutOfRangeException(String.valueOf(grade));
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (" + String.valueOf(gtid) + ") = "
            + String.valueOf(grade);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return this.gtid == ((Student) o).gtid;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return gtid;
    }

    @Override
    public int compareTo(Student s) {
        int comp = this.name.compareTo(s.name);
        if (0 == comp) {
            comp = this.gtid - s.gtid;
        }
        return comp;
    }
}
