package record.task3;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите степень:");
        int number2 = scanner.nextInt();

        int resolt = (int) Math.pow(number1, number2);
        System.out.printf("число %s, в степени %s = %s", number1,number2,resolt);


    }
}
