package Listing_3;

class StaticBlock3_18 {
    static double rootOf9; // корень из 9
    static double rootOf27; // корень из 27
    int number;

    static {
        System.out.println("Инициализация статических членов класса…");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }

    StaticBlock3_18(int number) {
        System.out.println("Инициализация переменных экземпляра класса…");
        this.number = number;
    }
}

class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Корень из 9 равен " + StaticBlock3_18.rootOf9);
        System.out.println("Koрень из 27 равен " + StaticBlock3_18.rootOf27);
        StaticBlock3_18 sb1 = new StaticBlock3_18(4);
        System.out.println("sb1.number = " + sb1.number);
        StaticBlock3_18 sb2 = new StaticBlock3_18(16);
        System.out.println("sb2.number = " + sb2.number);
    }
}