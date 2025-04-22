package practic.conditionalOperator.task9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 9.
         * У банка появилось мобильное приложение. Когда пользователь заходит на сайт с телефона,
         * ему предлагается скачать приложение с учетом ОС.
         * Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
         * и выдает соответствующее сообщение:
         * Для iOS — «Установите версию приложения для iOS».
         * Для Android — «Установите версию приложения для Android».
         * Объявите переменную clientOperationSystem, которая равна 0 или 1 (0 — iOS, 1 — Android).
         */

        Scanner scanner = new Scanner(System.in);

        System.out.printf("!!!Введите вашу ОС!!!%nГде 1 - Android, а 0 - IOS%n" );
        int clientOperationSystem = scanner.nextInt();
        scanner.nextLine();

        switch (clientOperationSystem){
            case 1:
                System.out.println("Установите версию для Android");
                break;
            case 0:
                System.out.println("Установите версию для IOS");
                break;
        }


    }

}
