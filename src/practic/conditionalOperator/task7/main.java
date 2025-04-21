package practic.conditionalOperator.task7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         *Задача 7.
         * Даны 2 числа. С помощью условного оператора выведите значение большего.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("!!!Введите два числа!!!");

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.printf("Первое число %d, больше чем второе число %d%n",num1, num2);
        }else {
            System.out.printf("Второе число %d, больше чем первое число %d%n", num2, num1);
        }


    }

}
