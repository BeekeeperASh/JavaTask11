import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {
    private static final int ELEMENT_COUNT = 10000000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        fillList(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        fillList(linkedList);

        // Измерение времени вставки в начало
        measureInsertionAtBeginning(arrayList, "ArrayList");
        measureInsertionAtBeginning(linkedList, "LinkedList");

        // Измерение времени вставки в конец
        measureInsertionAtEnd(arrayList, "ArrayList");
        measureInsertionAtEnd(linkedList, "LinkedList");

        // Измерение времени вставки в середину
        measureInsertionInMiddle(arrayList, "ArrayList");
        measureInsertionInMiddle(linkedList, "LinkedList");

        // Измерение времени удаления из начала
        measureRemovalAtBeginning(arrayList, "ArrayList");
        measureRemovalAtBeginning(linkedList, "LinkedList");

        // Измерение времени удаления из конца
        measureRemovalAtEnd(arrayList, "ArrayList");
        measureRemovalAtEnd(linkedList, "LinkedList");

        // Измерение времени удаления из середины
        measureRemovalInMiddle(arrayList, "ArrayList");
        measureRemovalInMiddle(linkedList, "LinkedList");

        // Измерение времени поиска по образцу
        measureSearchByPattern(arrayList, "ArrayList");
        measureSearchByPattern(linkedList, "LinkedList");
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(i);
        }
    }

    private static void measureInsertionAtBeginning(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();
        list.add(0, -1); // Вставка в начало
        long endTime = System.currentTimeMillis();
        System.out.println(listType + " - Вставка в начало: " + (endTime - startTime) + " мс");
    }

    private static void measureInsertionAtEnd(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();
        list.add(ELEMENT_COUNT, -1); // Вставка в конец
        long endTime = System.currentTimeMillis();
        System.out.println(listType + " - Вставка в конец: " + (endTime - startTime) + " мс");
    }

    private static void measureInsertionInMiddle(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();
        list.add(ELEMENT_COUNT / 2, -1); // Вставка в середину
        long endTime = System.currentTimeMillis();
        System.out.println(listType + " - Вставка в середину: " + (endTime - startTime) + " мс");
    }

    private static void measureRemovalAtBeginning(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();
        list.remove(0); // Удаление из начала
        long endTime = System.currentTimeMillis();
        System.out.println(listType + " - Удаление из начала: " + (endTime - startTime) + " мс");
    }

    private static void measureRemovalAtEnd(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();
        list.remove(list.size() - 1); // Удаление из конца
        long endTime = System.currentTimeMillis();
        System.out.println(listType + " - Удаление из конца: " + (endTime - startTime) + " мс");
    }

    private static void measureRemovalInMiddle(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();
        list.remove(list.size() / 2); // Удаление из середины
        long endTime = System.currentTimeMillis();
        System.out.println(listType + " - Удаление из середины: " + (endTime - startTime) + " мс");
    }

    private static void measureSearchByPattern(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();
        list.contains(-1); // Поиск по образцу
        long endTime = System.currentTimeMillis();
        System.out.println(listType + " - Поиск по образцу: " + (endTime - startTime) + " мс");
    }
}
