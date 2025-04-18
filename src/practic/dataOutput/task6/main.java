package practic.dataOutput.task6;

public class main {
    public static void main(String[] args) {

        /**
         * Задача 6
         * Объявите переменную правда типа boolean и присвойте ей значение true или false.
         * Выведите на экран фразу "Это правда?" и значение переменной правда.
         */

        boolean truOrfalse = true;
        System.out.printf("Так все же , правда или ложь? Ответ -  %b%n",truOrfalse);
        // %n - является переходом к новой строке ,в конце нашего предложения. без него,
        // строчка которая пойдет после этого предложения с клеиться со старой строкой. Так как printf не переносит.

    }
}
