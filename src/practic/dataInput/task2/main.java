package practic.dataInput.task2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 2
         * Запросите у пользователя ввести два числа.
         * Выведите на экран результат их сложения, вычитания, умножения и деления с использованием System.out.println.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста введите первое число: ");
        int num1 = input.nextInt();
        System.out.print("Пожалуйста введите второе число: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.printf("Сумма чисел %d и %d  = %d", num1,num2,sum);

    }
}
