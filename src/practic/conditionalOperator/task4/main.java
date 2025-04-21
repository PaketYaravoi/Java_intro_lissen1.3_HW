package practic.conditionalOperator.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 4.
         * Напишите программу, которая помогает определить,
         * в какое учреждение нужно отправить человека в зависимости от его возраста:
         * Если человеку меньше 3 лет, то ему нужно в ясли
         * Если человеку от 3 до 6 лет, то ему нужно ходить в детский сад.
         * Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if(age < 3 & age > 0) {
            System.out.printf("возраст: %d -  Вам еще в ясли)", age);
        } else if (age >= 3 & age <= 6 ){
            System.out.printf("Возраст: %d Детский сад!", age);

        } else if (age >= 7 & age <= 18){
            System.out.printf("Возраст: %d уже в школу.", age);
        } else {
            System.out.println("Вы ввели некорректные данные");
        }



    }
}
