package record.task5;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /*Написать логику функции определения знака числа.
          Если введено положительное число, то в консоль вывести 1, отрицательное -1, если 0, то 0.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        if(number > 0) {
            System.out.println("Число положительное");
        }
        else if(number == 0) {
            System.out.println("число равно нулю");
        }
        else {
            System.out.println("число отрицательное");
        }

    }
}
