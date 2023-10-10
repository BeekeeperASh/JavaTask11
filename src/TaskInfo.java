import java.util.Calendar;
import java.util.Date;

public class TaskInfo {
    public static void main(String[] args) {

        String lastName = "Шинёв";


        Date startDate = new Date(2023 - 1900, Calendar.SEPTEMBER, 26, 13, 30);

        // Дата и время сдачи задания
        Date endDate = new Date(); // Текущая дата и время

        // Вывод информации
        System.out.println("Фамилия разработчика: " + lastName);
        System.out.println("Дата и время получения задания: " + startDate);
        System.out.println("Дата и время сдачи задания: " + endDate);
    }
}
