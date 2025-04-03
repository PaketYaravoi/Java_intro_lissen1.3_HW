package record.task1;

public class main {
    public static void main(String[] args) {
        String name = "Иван Иванович";
        double rete = 87.34;
        String proffesion = "Програмист";
        String city = "Москва";

        String massage = "Уважаемый, %s!";
        String massage2 = "Поздравляем вас с зовершением проекта! Ваш рейтинг составил %.2f.";
        String massage3 = "Вы действительно %s! Желаем вам дальнейших успехов в городе %s!";

        System.out.printf(massage, name);
        System.out.println();
        System.out.printf(massage2, rete);
        System.out.println();
        System.out.printf(massage3, proffesion, city);

    }
}
