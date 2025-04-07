package record.task9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите баланс:");
        long balans = in.nextLong();

        System.out.println("Введите номер операции: ");
        System.out.println("1 - Пополнение");
        System.out.println("2 - Перевод");
        System.out.println("3 -Снятие наличных");
        System.out.println("номер операции: ");

        int operetionNumber = in.nextInt();

        switch (operetionNumber){
            case 1 -> {
                System.out.print("Введите сумму пополнеия:");
                long sum = in.nextLong();
                balans = balans + sum;
                System.out.println("новая сумма на счета = " + balans);
            }
            case 2 -> {
                System.out.println("Введите номер счета для перевода:");
                long number = in.nextLong();

                System.out.print("Введите сумму превода: ");
                long sum = in.nextLong();

                if (balans < sum){
                    System.out.println("Недостаточно средств");
                }
                else {
                    balans = balans - sum;
                    System.out.println("Операция выполнена успешно!");
                    System.out.println();
                    System.out.println("Текущий баланс: " + balans);
                }
            }
            case 3 -> {
                System.out.print("Введите сумму снятия:");
                long sum = in.nextLong();
                if(sum > balans){
                    System.out.println("Недостаточно средств");
                }
                else{
                    balans = balans - sum;
                    System.out.println("Операция выполнена успешно!");
                    System.out.println();
                    System.out.println("Текущий баланс = " + balans);
                }
            }
            default -> System.out.println("Неверный номер операции");
        }

    }
}
