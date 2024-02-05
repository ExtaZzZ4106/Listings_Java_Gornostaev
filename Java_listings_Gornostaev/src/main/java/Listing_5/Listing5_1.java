package Listing_5;

public class Listing5_1 {
    public static void main(String[] args) {
        int result;
        for (int divisor = -5; divisor <= 5; divisor++) {
            // использование тернарного оператора для защиты // ОТ Деления на ноль
            // Изучаем Јаvа на примерах и задачах
            result = divisor != 0 ? 100 / divisor : 0;
            if (result != 0) {
                System.out.println("100 / " + divisor + " = " + result);
            }
        }
    } // main(String[]) method
} // SecureDivisionOp class