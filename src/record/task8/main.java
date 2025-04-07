package record.task8;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        /*Напишите программу, которая помогает определить день недели по номеру дня. Использовать оператор switch.*/


        Scanner in = new Scanner(System.in);

        System.out.print("Введите число дня недели:");
        int input = in.nextInt();

        switch(input){
            case 1 -> System.out.println(input + " день недели - понедельник");
            case 2 -> System.out.println(input + " день недели - вторник");
            case 3 -> System.out.println(input + " день недели - среда");
            case 4 -> System.out.println(input + " день недели - четверг");
            case 5 -> System.out.println(input + " день недели - пятница");
            case 6 -> System.out.println(input + " день недели - суббота");
            case 7 -> System.out.println(input + " день недели - воскресенье");
            default -> System.out.println(" - такого  дня недели не существует");
        }
    }

}
