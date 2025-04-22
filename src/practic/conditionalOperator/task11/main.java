package practic.conditionalOperator.task11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 11.
         * Напишите программу, которая определяет, является ли год високосным или нет.
         * Переменную года назовите year, в которую можно подставить значение интересующего нас года.
         * Например, 2021. Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
         * « …. год является високосным» или «... год не является високосным».
         * Високосным является каждый четвертый год, но не является каждый сотый.
         * Также високосным является каждый четырехсотый год.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Введите год для проверки на высокосность:");

        int year = in.nextInt();

        boolean isEveryFour = (year % 4) == 0;
        boolean isEveryHundred = (year % 100) == 0;
        boolean isEverFourHungry = (year % 400) == 0;

        if(isEveryFour && !isEveryHundred || isEverFourHungry){
            System.out.println(year + " - год высокосный");
        }
        else{
            System.out.println(year + " - не высокосный год");
        }
    }
}



