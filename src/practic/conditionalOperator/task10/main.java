package practic.conditionalOperator.task10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 10.
         * У банка появилось мобильное приложение. Когда пользователь заходит на сайт с телефона, ему предлагается скачать приложение с учетом ОС и годом его создания.
         * Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
         * Если год выпуска ранее 2020 года, то к сообщению об установке нужно добавить информацию о лайт версии:
         * Для iOS оно будет звучать так: «Скачайте лайт версию приложения для iOS по ссылке».
         * Для Android: «Скачайте лайт версию приложения для Android по ссылке».
         * Для пользователей телефонов 2020 года выпуска и позже нужно вывести обычное предложение об установке приложения.
         * Для года создания телефона используйте переменную clientPhoneYear, в которой необходимо указать 2020 год. Используйте не больше двух вложенностей в условии.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.printf("!!!Введите вашу ОС!!!%nГде 1 - Android, а 0 - IOS%n" );
        int clientOperationSystem = scanner.nextInt();
        scanner.nextLine();

        System.out.println("!!!Введите год выпуска вашего устройства:" );
        int ageGaget = scanner.nextInt();
        scanner.nextLine();

        if (clientOperationSystem == 0 && ageGaget < 2020){
            System.out.println("Скачайте лайт версию приложения для iOS по ссылке");

        } else if (clientOperationSystem == 1 && ageGaget < 2020) {
            System.out.println("Скачайте лайт версию приложения для Android по ссылке");

        } else if (clientOperationSystem == 0 && ageGaget >= 2020) {
            System.out.println("Установка приложения для IOS по ссылке");

        } else {
            System.out.println("Установка приложения для Android по ссылке");
        }
    }
}
