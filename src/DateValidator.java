import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {

    public static String validateDate(String dateString) {
        // Определяем формат даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");

        try {
            // Парсим строку в объект LocalDate
            LocalDate date = LocalDate.parse(dateString, formatter);

            // Проверяем, находится ли дата в допустимом диапазоне
            if (date.getYear() < 1 || date.getYear() > 9999) {
                return "Ошибка: год должен быть в диапазоне от 0001 до 9999.";
            }

            return date.toString(); // Возвращаем корректную дату в формате YYYY-MM-DD
        } catch (DateTimeParseException e) {
            return "Ошибка: введенная строка не является корректной датой в формате 'YYYY-MM-DD'.";
        }
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(validateDate("2024-11-17"));  // Корректная дата
        System.out.println(validateDate("2020-02-29"));  // Корректная дата (высокосный год)
        System.out.println(validateDate("2021-02-29"));  // Ошибка: некорректная дата
        System.out.println(validateDate("2024-13-01"));  // Ошибка: некорректная дата
        System.out.println(validateDate("2024-11-31"));  // Ошибка: некорректная дата
    }
}