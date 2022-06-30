import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Integer[] numbers = {1000, 10000, 100000};

        repeatReversing(numbers, string);
    }

    public static String reverseString(String string) {
        char[] charsString = string.toCharArray();
        String stringReverse = "";
        for (int i = charsString.length - 1; i >= 0; i--) {
            stringReverse += charsString[i];
        }
        return stringReverse;
    }

    public static void repeatReversing(Integer[] numbers, String string) {
        System.out.println("Развернутая строка: " + reverseString(string));
        for (Integer integer : numbers) {
            long res = 0;
            long start = System.nanoTime();
            for (int i = 0; i < integer; i++) {
                reverseString(string);
            }
            long finish = System.nanoTime();
            res = finish - start;
            System.out.println("Количество повторений = " + integer + ", затраченное время = " + res);
        }
    }
}
