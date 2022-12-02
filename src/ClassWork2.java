import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {
        // Level2:
        // С консоли вводится трехзначное число.
        // Найдите в нем первую, вторую и третью цифры.
        // Используйте при этом / и (или) %
        numberDissecting();
    }

    public static void numberDissecting() {
        int inputValue = getNumber();
        printResult(inputValue);
    }

    /**
     * Считывает целое число из консоли.
     *
     * @return Введенное число.
     */
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputValue = scanner.nextInt();
        return inputValue;
    }

    /**
     * Вычисляет первую цифру числа.
     *
     * @param number Число
     * @return Первая цифра числа
     */
    public static int getFirstNumber(int number) {
        return (number / 100) % 10;
    }

    /**
     * Вычисляет вторую цифру числа.
     *
     * @param number Число
     * @return Вторая цифра числа
     */
    public static int getSecondNumber(int number) {
        return (number / 10) % 10;
    }

    /**
     * Вычисляет третью цифру числа.
     *
     * @param number Число
     * @return Третья цифра числа
     */
    public static int getThirdNumber(int number) {
        return number % 10;
    }

    /**
     * Выводит на экран три цифры, из которых состоит число.
     *
     * @param inputNumber Число
     */
    public static void printResult(int inputNumber) {
        System.out.printf("Первая цифра: %d\n", getFirstNumber(inputNumber));
        System.out.printf("Вторая цифра: %d\n", getSecondNumber(inputNumber));
        System.out.printf("Третья цифра: %d\n", getThirdNumber(inputNumber));
    }

}
