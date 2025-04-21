package practic.conditionalOperator.task6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /**
         * Задача 6.
         * Вместимость поезда — 2500 человек. Поезд рассчитан на 344 сидячих мест, все остальные — стоячие.
         * С помощью условного оператора и конструкции else if напишите программу, которая выводит в консоль сообщение
         * о том, есть ли место в вагоне, сидячее или стоячее, или поезд уже полностью забит.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущее колличество людей в поезде:");
        int peaple = scanner.nextInt();

        if(peaple >= 344 && peaple <=2500) {
            System.out.printf("Места еще есть! Вы можете приобрести только стоячее место!");
        }else if ((peaple <= 344 && peaple >=0)) {
            System.out.printf("Места еще есть! Вы можете приобрести седячее место!");
        }
        else {
            System.out.println("Вы вышли из диапазона колличества вместимости поезда");
        }
    }
}
