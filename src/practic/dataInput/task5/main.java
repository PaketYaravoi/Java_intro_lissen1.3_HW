package practic.dataInput.task5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 5
         * Запросите у пользователя ввести свое имя, возраст, и любой интересный факт о себе.
         * Выведите на экран информацию о пользователе с использованием System.out.print и System.out.println.
         */


        System.out.print("input your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Your name: %s", name);


        System.out.print("input your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Your age: %d", age);
        System.out.println();

        System.out.println("input your fakt:");
        String interestingFakt = scanner.nextLine();
        System.out.printf("Your fakt: %s%n", interestingFakt);


    }
}
