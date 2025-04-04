package record.task5;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

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
