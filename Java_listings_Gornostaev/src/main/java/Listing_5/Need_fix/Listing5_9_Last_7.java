package Listing_5.Need_fix;

public class Listing5_9_Last_7 {
    private char[] q;
    private int putloc;
    private int getloc;

    // Конструктор для создания пустой очереди заданного размера
    Listing5_9_Last_7(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
    }

    // Конструктор для создания очереди на основе существующего объекта
    Listing5_9_Last_7(Listing5_9_Last_7 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        System.arraycopy(ob.q, 0, q, 0, ob.q.length);
    }

    // Конструктор для создания очереди на основе массива символов
    Listing5_9_Last_7(char[] a) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (char ch : a) {
            put(ch);
        }
    }

    // Проверка, полная ли очередь
    boolean isFull() {
        return (putloc == q.length - 1);
    }

    // Проверка, пустая ли очередь
    boolean isEmpty() {
        return (getloc == putloc);
    }

    // Добавление символа в очередь
    void put(char ch) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Очередь полна.");
        }
        q[putloc++] = ch;
    }

    // Получение символа из очереди
    char get() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }
        return q[getloc++];
    }
}
