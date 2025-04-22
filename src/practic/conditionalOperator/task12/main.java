package practic.conditionalOperator.task12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 12.
         * Чтобы известить клиента о том, когда будет доставлен его заказ, нужно знать расстояние от склада до адреса доставки.
         * Правила доставки:
         * Доставка в пределах 50 км занимает сутки.
         * Доставка в пределах от 50 км до 80 км добавляет еще один день доставки.
         * Доставка в пределах 80 км до 150 км добавляет еще одни сутки.
         * Свыше 150 км доставки нет.
         * Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки заказа.
         * Объявите целочисленную переменную deliveryDistance, которая содержит дистанцию от склада до клиента.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Введите растояние заказа");

        int deliveryDistance = in.nextInt();
        in.nextLine();

        int minDays = 0;

        if(deliveryDistance >= 1 && deliveryDistance <= 50){
            minDays += 1;
            System.out.printf("Доставка занимает: %d", minDays);
        } else if (deliveryDistance > 50 && deliveryDistance <= 80) {
            minDays +=2;
            System.out.printf("Доставка занимает: %d", minDays);

        } else if (deliveryDistance > 80 && deliveryDistance <= 150){
            minDays +=3;
            System.out.printf("Доставка занимает: %d", minDays);
        } else {
            System.out.println("Доставки нет");
        }



    }
}
