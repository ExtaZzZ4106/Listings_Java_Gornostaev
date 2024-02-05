package Listing_3;

class Factorial3_17 {
    static long computeI(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long computeR(int n) {
        if (n == 1) return 1;
        return computeR(n - 1) * n;
    }
}

class FactorialDemo {
    public static void main(String[] args) {
        System.out.println("Вычисление факториала в цикле:");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + Factorial3_17.computeI(i));
        }
        System.out.println("Вычисление факториала рекурсивным методом: ");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r + "! = " + Factorial3_17.computeR(r));
        }
    }
}