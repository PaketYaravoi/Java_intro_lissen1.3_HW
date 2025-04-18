package practic.dataInput.task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста впишите свое имя: ");
        String name = scanner.nextLine();

        System.out.printf("Ваше имя: %s%n", name);

    }
}
