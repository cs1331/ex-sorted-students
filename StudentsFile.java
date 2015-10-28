import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class StudentsFile {

    private File file;

    public StudentsFile(File file) {
        this.file = file;
    }

    public StudentsFile(String filename) {
        this(new File(filename));
    }

    public List<Student> getStudents() throws IOException {
        List<Student> students = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        for (String line = reader.readLine();
            line != null;
            line = reader.readLine()) {

            String[] student = line.split(",");
            students.add(new Student(student[0].trim(),
                                     Integer.parseInt(student[1].trim()),
                                     Float.parseFloat(student[2].trim())));
        }
        reader.close();
        return students;
    }
}
