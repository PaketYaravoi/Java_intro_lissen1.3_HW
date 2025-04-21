package practic.conditionalOperator.task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /** Задача 1.
         С помощью условного оператора напишите программу, которая выводит в консоль:
         сообщение о том, что человеку 18 или больше лет;
         сообщение, что человек не достиг совершеннолетия.
         При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
         «Если возраст человека равен …, то (вывести в зависимости от результата) он совершеннолетний /
         он не достиг совершеннолетия».
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if(age >= 18) {
            System.out.printf("Твой возраст равен %d  - значит ты совершеннолетний!", age);
        } else {
            System.out.printf("Твой возраст равен %d  - значит ты Несовершеннолетний!", age);
        }
    }
}
