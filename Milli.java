public class Milli {

    public static void main(String[] args) {
        int price = 200; // стоимость билета
        int bonus = 20; // кол-во рублей для 1 бонусной милли
        int milli = price / bonus; // кол-во бонусных милль

        System.out.println("Количество начисленных милли за купленный билет: " + milli);
        

    }
}
