public class Main {
    public static void main(String[] args) {
        int startingBill = 100; // Начальный счет клиента
        int amountPlus = 1859; // Сумма пополнения
        int amountRubles = 100; // Количество рублей, за которые начсляется 1 рубль
        int amountBonus;

        if (amountPlus > 1000) {
            amountBonus = amountPlus / amountRubles;
        } else {
            amountBonus = 0;
        }
        int finalBill = startingBill + amountPlus + amountBonus;

        System.out.println("Итоговый счет - " + finalBill);
        System.out.println("Количество бонусных рублей - " + amountBonus);
    }
}
