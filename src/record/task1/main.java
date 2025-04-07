package record.task1;

public class main {
    public static void main(String[] args) {

        /* Используя форматированный вывод написать письмо:
    Уважаемый «имя»,
    Поздравляем вас с успешным завершением проекта!
    Ваш рейтинг составляет «дробное число».
    Вы отлично справились со своими обязанностями как «профессия».
    Желаем вам дальнейших успехов в вашей карьере в городе «город».*/


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
