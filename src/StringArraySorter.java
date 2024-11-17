import java.util.Arrays;

public class StringArraySorter {

    public static String[] sortStrings(String[] inputArray) {
        // Проверка на null
        if (inputArray == null) {
            System.out.println("Ошибка: Входной массив равен null. Возвращается пустой массив.");
            return new String[0]; // Возвращаем пустой массив
        }

        // Сортировка массива
        Arrays.sort(inputArray);
        return inputArray; // Возвращаем отсортированный массив
    }

    public static void main(String[] args) {
        // Пример использования метода
        String[] strings = {"banana", "apple", "orange", "kiwi"};
        String[] sortedStrings = sortStrings(strings);

        System.out.println("Отсортированный массив: " + Arrays.toString(sortedStrings));

        // Пример с null
        String[] nullArray = null;
        String[] result = sortStrings(nullArray);
        System.out.println("Результат для null: " + Arrays.toString(result));
    }
}