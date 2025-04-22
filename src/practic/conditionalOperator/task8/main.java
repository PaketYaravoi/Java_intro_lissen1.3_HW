package practic.conditionalOperator.task8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 8.
         * Даны 3 числа. С помощью условного оператора выведите значение меньшего.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("!!!Введите три числа!!!");

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num1 < num3){
            System.out.printf("Первое число %d, меньше чем второе число %d%n, и меньше чем третье %d",num1, num2, num3);
        }

        else if (num2 < num1 && num2 < num3){
            System.out.printf("Второе число %d, меньше чем первое число %d%n, и меньше чем третье %d", num2, num1, num3);
        }

        else if (num1 == num2 && num2 < num3){
            System.out.printf("1е и 2е числа равны - %d они же наименьшие");
        }

        else if (num1 == num2 && num2 > num3) {
            System.out.printf("1е и 2е числа равны - %d, наименьшее число 3е - %d", num1, num3);
        }
        else if (num2 == num3 && num2 < num3) {
            System.out.printf("1е и 2е числа равны - %d они же наименьшие");
        }
        else if (num1 == num2 && num2 == num3) {
            System.out.println("все равны");
        } else {
            System.out.println("Некоректные данные");
        }
    }
}
