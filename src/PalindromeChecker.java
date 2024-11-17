public class PalindromeChecker {

    public static String checkPalindrome(String input) {
        // Удаляем пробелы и приводим строку к нижнему регистру
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Создаем обратную строку
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        // Сравниваем очищенную строку с её обратной версией
        if (cleanedInput.equals(reversedInput)) {
            return "Palindrome";
        } else {
            return "Not a palindrome";
        }
    }

    public static void main(String[] args) {
        // Пример использования метода
        String testString = "A man a plan a canal Panama";
        System.out.println(checkPalindrome(testString)); // Вывод: Palindrome
    }
}