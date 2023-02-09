package Lesson_5;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число: ");
            int n1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int n2 = scanner.nextInt();
            int sum = n1 + n2;
            int minus = n1 - n2;
            int multiply = n1 * n2;
            int divide = n1 / n2;
            int rnums = n1 % n2;
            System.out.printf("Результат суммы = %d\nРезультат вычитания = %d\nРезультат умножения = %d\nРезультат деления = %d\nОстаток от деления = %d\n ", sum, minus, multiply, divide, rnums);
        }
    }

}