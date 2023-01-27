public class Bonus {

    public static void main(String[] args) {
        int balance = 200; // начальный счет
        int addBalance = 1200; // сумма пополнения
        int bonus = 1; // кол-во бонусов
        int addBonus;

        if (addBalance >= 1000) {
            addBonus = addBalance / 100 * bonus;

        } else {
            addBonus = 0;

        }

        System.out.println("Бонус: " + (balance + addBalance + addBonus));
    }
}
