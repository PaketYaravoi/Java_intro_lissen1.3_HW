package practic.dataInput.task4_swich;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 4
         * Запросите у пользователя ввести оценку студента.
         * Выведите на экран сообщение о его успеваемости
         * (например, "Отлично!", "Хорошо", "Удовлетворительно" и т.д.) с использованием System.out.println.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Input yor point: ");
        int point = input.nextInt();

            switch (point) {
                case 1:
                    System.out.println("Very bad");
                    break;
                case 2:
                    System.out.println("Bad");
                    break;
                case 3:
                    System.out.println("Sow-sow");
                    break;
                case 4:
                    System.out.println("Good");
                    break;
                case 5:
                    System.out.println("Very good!");
                    break;
            }
    }
}
