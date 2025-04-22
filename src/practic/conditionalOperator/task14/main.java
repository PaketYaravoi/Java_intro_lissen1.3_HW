package practic.conditionalOperator.task14;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 14.
         * Напишите программу, которая в зависимости от выбора пользователя выводит нужный раздел.
         * 1 – Найти билеты на самолет
         * 2 – Купить билеты на самолет
         * 3 – Сдать ранее купленные билеты
         * 4 – Зарегистрироваться на рейс
         * 5 - Связаться с поддержкой
         * Например, если пользователь вводит 4, в консоль выводим: «Форма регистрации на рейс».
         * Для написания программы используйте оператор switch.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите раздел (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Поиск билетов на самолет");
                break;
            case 2:
                System.out.println("Покупка билетов на самолет");
                break;
            case 3:
                System.out.println("Возврат ранее купленных билетов");
                break;
            case 4:
                System.out.println("Форма регистрации на рейс");
                break;
            case 5:
                System.out.println("Связь с поддержкой");
                break;
            default:
                System.out.println("Ошибка: выберите раздел от 1 до 5");
                break;
        }

        scanner.close();
    }
}
