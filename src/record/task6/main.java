package record.task6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("ВВедите вашу скорость в км/ч: ");

        int speed = in.nextInt();

        if(speed <= 60) {
            System.out.println("вы не привысили скорость, штрафа не будет");
            }
        else {
            System.out.println("Вы привысиди скорость , получайте штраф");
        }
    }
}
