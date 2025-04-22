package practic.conditionalOperator.task13;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 13
         * Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
         * Например, 1-й месяц (январь) принадлежит к сезону зима. Для написания программы используйте оператор switch.
         * Для обозначения номера месяца используйте переменную monthNumber.
         * Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
         */

        Scanner in = new Scanner(System.in);

        System.out.println("номер месяца: ");

        int monthNumber = in.nextInt();
        in.nextLine();
        int quarter = 0;

        // Проверка на некорректный номер месяца
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректные данные: номер месяца должен быть от 1 до 12.");
            in.close();
            return; // Завершаем программу
        }

        // Определяем сезон
        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неизвестный сезон"; // На случай, если что-то пошло не так
                break;
        }

        System.out.println("Сезон: " + season);
        in.close();

    }

}
