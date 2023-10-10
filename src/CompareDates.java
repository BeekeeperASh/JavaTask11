import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {
    public static void main(String[] args) {

        Date currentDate = new Date();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время (в формате dd-MM-yyyy HH:mm:ss): ");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date userDate = null;

        try {
            userDate = dateFormat.parse(userInput);
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты и времени. Пожалуйста, введите в корректном формате.");
            System.exit(1);
        }

        if (currentDate.before(userDate)) {
            System.out.println("Введенная дата и время находятся в будущем относительно текущего момента.");
        } else if (currentDate.after(userDate)) {
            System.out.println("Введенная дата и время находятся в прошлом относительно текущего момента.");
        } else {
            System.out.println("Введенная дата и время совпадают с текущим моментом.");
        }
    }
}
