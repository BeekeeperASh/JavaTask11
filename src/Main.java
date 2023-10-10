import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date birthDate = new Date();
        Student student = new Student(birthDate);

        System.out.println("Короткий формат даты:");
        System.out.println(student.toString("dd.MM.yyyy"));

        System.out.println("\nСредний формат даты:");
        System.out.println(student.toString("dd MMM yyyy"));

        System.out.println("\nПолный формат даты и времени:");
        System.out.println(student.toString("dd.MM.yyyy HH:mm:ss"));
    }
}