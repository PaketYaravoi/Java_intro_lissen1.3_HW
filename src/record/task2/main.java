package record.task2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println(" Введите число:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.printf("Вы ввели число: %d ", age);
        System.out.println();


        System.out.println("Введите ваше имя:");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.printf("Ваше имя: %s", name);




    }
}
