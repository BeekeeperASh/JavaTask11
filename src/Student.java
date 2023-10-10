import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student> {
    private int id;

    private int gpa;

    private Date birthDate;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, int gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public Student(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Метод toString() с возможностью выбора формата даты
    public String toString(String dateFormatPattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
        return "Дата рождения: " + dateFormat.format(birthDate);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
