package record.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:" );
        int number2 = scanner.nextInt();

        System.out.println("Наименьшее число равно:");
        if(number1 <= number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);

        }
    }
}

