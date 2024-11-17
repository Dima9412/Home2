public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        // Проверяем, является ли массив null или пустым
        if (numbers == null || numbers.length == 0) {
            System.out.println("Ошибка: массив пустой или равен null.");
            return Double.NaN;
        }

        // Суммируем элементы массива
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Вычисляем среднее значение
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        // Пример использования метода
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);

        if (!Double.isNaN(average)) {
            System.out.println("Среднее значение: " + average);
        }

        // Пример с пустым массивом
        int[] emptyArray = {};
        double emptyAverage = calculateAverage(emptyArray);

        // Пример с null
        double nullAverage = calculateAverage(null);
    }
}
