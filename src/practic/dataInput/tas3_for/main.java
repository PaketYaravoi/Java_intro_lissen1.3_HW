package practic.dataInput.tas3_for;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 3
         * Запросите у пользователя ввести число.
         * Выведите на экран таблицу умножения этого числа от 1 до 10 с использованием System.out.println.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int numUser = input.nextInt();

        for(int i = 1; i <= 10; i ++){
            System.out.printf("%d * %d = %d%n", numUser, i,numUser * i );
        }

    }
}
