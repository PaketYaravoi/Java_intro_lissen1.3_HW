package record.task7;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

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
